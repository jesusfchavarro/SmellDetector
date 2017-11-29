package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    public WebView webView;
    public StackedBarChart<String,Number> varChart;


    public void load(ActionEvent actionEvent) {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://refactoring.guru/refactoring/smells");

    }

    @FXML
    protected void initialize(){

    }
}
