package jfx.c01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloFX extends Application {      // (1)

    public static void main(String[] args) {
        launch(args);                           // (2)
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane(new Label("Hello, JavaFX")); // (3)
        primaryStage.setScene(new Scene(root, 300, 200));             // (4)
        primaryStage.setTitle("HelloFX");                             // (5)
        primaryStage.show();                                          // (6)
    }
}
