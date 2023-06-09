package com.example.kinoverwaltung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class kinoverwaltung implements Initializable {
    @FXML
    private Menu mBuchen;
    @FXML
    private Menu mVorstellungen;
    @FXML
    private Menu mFilme;
    @FXML
    private Menu mKunden;
    @FXML
    private Menu mMitarbeiter;
    @FXML
    private Menu mKinos;
    @FXML
    private Label lbTitle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mBuchenAction(ActionEvent event) {

        lbTitle.setText("Buchen");
        try {

        } finally {

        }

    }

    @FXML
    private void mVorstellungenAction(ActionEvent event) {
        lbTitle.setText("Vorstellungen");
    }
    @FXML
    private void mFilmeAction(ActionEvent event) {
        lbTitle.setText("Filme");
    }
    @FXML
    private void mKundenAction(ActionEvent event) {
        lbTitle.setText("Kunden");
    }
    @FXML
    private void mMitarbeiterAction(ActionEvent event) {
        lbTitle.setText("Mitarbeiter");
    }
    @FXML
    private void mAction(ActionEvent event) {
        lbTitle.setText("Kinos");
    }
}