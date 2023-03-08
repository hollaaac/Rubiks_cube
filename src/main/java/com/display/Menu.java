package com.display;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Menu extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu");

        // Create label and button
        Label label = new Label("Not Clicked");
        Button button = new Button("Click");

        // Add listener to button
        button.setOnAction(value -> {
            label.setText("Clicked");
        });

        HBox hbox = new HBox(button, label);

        // Create scene
        Scene scene = new Scene(hbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
