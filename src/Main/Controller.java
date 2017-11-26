package Main;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    public WebView webView;


    public void load(ActionEvent actionEvent) {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://refactoring.guru/refactoring/smells");

    }
}
