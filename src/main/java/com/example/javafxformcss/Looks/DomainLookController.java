package com.example.javafxformcss.Looks;

import com.example.javafxformcss.DBConnect.DomainRep;
import com.example.javafxformcss.DBConnect.DomainRepImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.example.javafxformcss.Looks.DomainLook.*;
import static com.example.javafxformcss.Looks.PersonLookController.person;


public class DomainLookController implements Initializable {
    static boolean changeStyle = false;
    @FXML
    private TableView<DomainTable> domainTable;
    @FXML
    private TableColumn<DomainTable, String> webNameColumn;
    @FXML
    private TableColumn<DomainTable, String> domainNameColumn;
    @FXML
    private TableColumn<DomainTable, String> ipColumn;
    @FXML
    private TableColumn<DomainTable, LocalDate> registrationDateColumn;
    @FXML
    private TableColumn<DomainTable, String> countryColumn;
    @FXML
    public Button changeCssButton;

    private final DomainRep domainRep;

    private final DomainLook domainLook;

    public DomainLookController() {
        domainLook = new DomainLook();
        domainRep = new DomainRepImpl();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ObservableList<DomainTable> observableList = FXCollections.observableArrayList();
        domainRep.getDomainByPersonId(person.getId()).forEach(domain -> {
            observableList.add(new DomainTable(
                    domain.getWebName(),
                    domain.getDomainName(),
                    domain.getIp(),
                    domain.getRegistrationDate(),
                    domain.getCountry()
            ));
        });

        webNameColumn.setCellValueFactory(new PropertyValueFactory<DomainTable, String>("webName"));
        domainNameColumn.setCellValueFactory(new PropertyValueFactory<DomainTable, String>("domainName"));
        ipColumn.setCellValueFactory(new PropertyValueFactory<DomainTable, String>("ip"));
        registrationDateColumn.setCellValueFactory(new PropertyValueFactory<DomainTable, LocalDate>("registrationDate"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<DomainTable, String>("country"));
        domainTable.setItems(observableList);

    }


    @FXML
    public void handleButtonActionChangeStyle(ActionEvent e) {
        Scene scene = changeCssButton.getScene();
        if (changeStyle) {
            changeStyle = false;
            scene.getStylesheets().clear();
            scene.getStylesheets().add("/DomainLookStyleTwo.css");
        } else {
            changeStyle = true;
            scene.getStylesheets().clear();
            scene.getStylesheets().add("/DomainLookStyleOne.css");
        }

        }
    }







