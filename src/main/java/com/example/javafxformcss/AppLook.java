package com.example.javafxformcss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLook extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AppLook.fxml"));

        Scene scene = new Scene(root);
        root.getStylesheets().add(AppLook.class.getResource("AppLook.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("JavaFX Welcome");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}