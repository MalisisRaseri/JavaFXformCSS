package com.example.javafxformcss;

import com.example.javafxformcss.DBConnect.UserRepImpl;
import com.example.javafxformcss.Looks.PersonLook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AppController implements Initializable {

    @FXML
    private Button buttonSignIn;
    @FXML
    private TextField textName;
    @FXML
    private TextField textPassword;
    @FXML
    private Label textLabel;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        UserRepImpl usl = new UserRepImpl();
        PersonLook pl = new PersonLook();
        if (event.getSource().equals(buttonSignIn)) {
            usl.getUsers().forEach(e -> {
                if (textName.getText().equals(e.getName()) && textPassword.getText().equals(e.getPassword())) {
                    textLabel.setText("connected");
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.hide();
                    try {
                        pl.init();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    textLabel.setText("NOT connected");
                }
            });
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
