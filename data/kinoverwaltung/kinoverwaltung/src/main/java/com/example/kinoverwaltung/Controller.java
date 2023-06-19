package com.example.kinoverwaltung;

import javafx.beans.property.ListProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import objects.Vorschau;
import objects.Vorstellung;
import util.DML_DAO;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private DatePicker dpDatum;
    @FXML
    private TableView tvVorschau;
    @FXML
    private TableColumn tcFilm;
    @FXML
    private TableColumn tcUhrzeit;
    @FXML
    private TextField tfVorname;
    @FXML
    private TextField tfNachname;
    @FXML
    private TextField tfStrasse;
    @FXML
    private TextField tfHNr;
    @FXML
    private TextField tfEmail;
    @FXML
    private Spinner spKartenanzahl;
    @FXML
    private Button btnBuchen;

    @FXML
    void vorschau(ActionEvent event) {
        try {
            ObservableList<Vorstellung> vorstellungen = Application.Vorstellungen(dpDatum.getValue().toString());
            ObservableList<Vorschau> vorschauen = Application.Vorschauen(vorstellungen);
            tcFilm.setCellValueFactory( new PropertyValueFactory<objects.Vorschau,String>("film") );
            tcUhrzeit.setCellValueFactory( new PropertyValueFactory<objects.Vorschau,String>("start") );
            tvVorschau.setItems(vorschauen);
            spKartenanzahl.setValueFactory( new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 9) );
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
    @FXML
    void buchen(ActionEvent event) {
        System.out.println("Test");
    }

}