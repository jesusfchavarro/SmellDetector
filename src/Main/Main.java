package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

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
        launch(args);
    }
}
