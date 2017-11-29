package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.Java8Lexer;
import parser.java8Parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        primaryStage.setTitle("Smell Detector");
        Rectangle2D screen = Screen.getPrimary().getBounds();
        primaryStage.setScene(new Scene(root, screen.getWidth(), screen.getHeight()));
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception{
        InputStream in = System.in;
        System.setIn(new FileInputStream(new File("src/Main/StatisticsVisitor.java")));
        CharStream input = CharStreams.fromStream(System.in);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        java8Parser parser = new java8Parser(tokens);

//        ParseTree tree = parser.procs();
//        MyVisitor<Object> loader = new MyVisitor<>();
//        System.setIn(in);
//        loader.visit(tree);
        launch(args);
    }
}
