package com.example.kinoverwaltung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private DatePicker dpDatum;
    @FXML
    private TableView tvVorschau;
    @FXML
    private ComboBox cbAuswahl;
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
        String sql = "SELECT * FROM Vorstellung WHERE DATE(timestamp) = '" + dpDatum.getValue() + "';";
        System.out.println(sql);
    }
    @FXML
    void buchen(ActionEvent event) {
        System.out.println("Test");
    }
}