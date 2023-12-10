package com.example.javafxformcss.Looks;

import com.example.javafxformcss.AppLook;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonLook extends Stage {

    public void init () throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PersonLook.fxml"));

        Scene scene = new Scene(root);

        setTitle("Persons");
        setScene(scene);
        setResizable(false);
        show();
    }
}

