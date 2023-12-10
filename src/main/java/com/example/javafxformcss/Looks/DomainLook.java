package com.example.javafxformcss.Looks;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DomainLook extends Stage {

    public static Scene staticScene;

    public void init() throws IOException {

        Parent root = FXMLLoader.load(DomainLook.class.getResource("/DomainLook.fxml"));
        Scene scene = new Scene(root);
        setTitle("Domain");
        setScene(scene);
        setResizable(false);
        show();


    }
}

