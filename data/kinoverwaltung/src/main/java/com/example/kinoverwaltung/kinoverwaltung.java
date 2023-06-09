package com.example.kinoverwaltung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("buchen.fxml"));
            Pane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
                }
            }


    @Deprecated
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