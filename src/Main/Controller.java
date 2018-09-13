package Main;

import Detectors.LongClassAndDataClass;
import Detectors.LongMethodDetector;
import Detectors.LongParameterListDetector;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.Java8Lexer;
import parser.java8Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Controller {
    public WebView webView;
    public StackedBarChart<String,Number> varChart;
    public CategoryAxis stackBarX;
    public TextArea textArea;
    public ScrollPane scrollPane;
    public TabPane tabPane;
    public VBox smellsLog;
    public SplitPane smellsSplitPane;

    private WebEngine webEngine;

    private ParseTree createTree(/*FileInputStream file*/ String code) throws IOException {
        //InputStream in = System.in;

        //System.setIn(file);
        CharStream input = CharStreams.fromString(code);//fromStream(System.in);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        java8Parser parser = new java8Parser(tokens);
        //System.setIn(in);
        return parser.compilationUnit();
    }

    private void showAlert(String message) {
        Dialog<Void> alert = new Dialog<>();
        alert.getDialogPane().setContentText(message);
        alert.getDialogPane().getButtonTypes().add(ButtonType.OK);
        alert.showAndWait();
    }

    private void makeChart1(ParseTree tree){
        StatisticsVisitor stats = new StatisticsVisitor(new HashMap<>());
        stats.visit(tree);
        Set keys = stats.varUsage.keySet();
        stackBarX.getCategories().clear();
        stackBarX.setCategories( FXCollections.observableArrayList (keys));
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Variable's Usage");
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Variable's Changes");
        Map.Entry<String, Integer[]> e;
        for ( Object entry : stats.varUsage.entrySet()) {
            e = (Map.Entry<String, Integer[]>)entry;
            series1.getData().add(new XYChart.Data<>(e.getKey(),e.getValue()[0]));
        }
        for ( Object entry : stats.varUsage.entrySet()) {
            e = (Map.Entry<String, Integer[]>)entry;
            series2.getData().add(new XYChart.Data<>(e.getKey(),e.getValue()[1]));
        }
        varChart.getData().clear();
        varChart.getData().addAll(series1, series2);
        varChart.setCategoryGap(10);
    }

    private void runAnalysis(String code) throws IOException {
        textArea.setText(code);
        ParseTree tree = createTree(code);
        makeChart1(tree);
        LongParameterListDetector a = new LongParameterListDetector(tree, smellsLog, webEngine);
        LongMethodDetector b = new LongMethodDetector(tree, smellsLog, webEngine);
        LongClassAndDataClass c = new LongClassAndDataClass(tree, smellsLog, webEngine);
    }
    @FXML
    protected void initialize() throws IOException {
        scrollPane.prefHeightProperty().bind(tabPane.widthProperty());
        scrollPane.prefHeightProperty().bind(tabPane.heightProperty());

        textArea.prefWidthProperty().bind(scrollPane.widthProperty());
        textArea.prefHeightProperty().bind(scrollPane.heightProperty());

        webView.prefWidthProperty().bind(((Pane)webView.getParent()).widthProperty());
        webView.prefHeightProperty().bind(((Pane)webView.getParent()).heightProperty());

        varChart.prefWidthProperty().bind(tabPane.widthProperty());
        varChart.prefHeightProperty().bind(tabPane.heightProperty().divide(2));

        tabPane.prefWidthProperty().bind(((Pane)tabPane.getParent()).widthProperty());
        tabPane.prefHeightProperty().bind(((Pane)tabPane.getParent()).heightProperty().subtract(29));

        smellsLog.prefWidthProperty().bind(smellsSplitPane.widthProperty());

        webEngine = webView.getEngine();
        webEngine.setOnAlert(event -> showAlert(event.getData()));
        //webEngine.
        webEngine.load("https://refactoring.guru/refactoring/smells");
        textArea.focusedProperty().addListener((observable, oldValue, newValue) -> {
            smellsLog.getChildren().clear();
            try {
                runAnalysis(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        String pathFile = "source/prueba.java";

        String code = Files.lines(Paths.get(pathFile)).collect(Collectors.joining("\n"));

        runAnalysis(code);

    }
}
