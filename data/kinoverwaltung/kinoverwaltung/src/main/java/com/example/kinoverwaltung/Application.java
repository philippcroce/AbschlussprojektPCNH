package com.example.kinoverwaltung;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objects.Film;
import objects.Vorschau;
import objects.Vorstellung;
import util.DML_DAO;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("kinoverwaltung.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Kinoverwaltung");
        stage.setScene(scene);
        stage.show();
    }

    public static ObservableList<Vorstellung> Vorstellungen(String date) throws SQLException {
        String sql = "SELECT * FROM Vorstellung WHERE DATE(ZP_S) = '" + date + "';"; System.out.println(sql);
        ObservableList<Vorstellung> vorstellungen = FXCollections.observableArrayList();
        ResultSet rs = DML_DAO.executeDML(sql);
        if (rs != null) {
            while (rs.next()) {
                Vorstellung v = new Vorstellung(
                        rs.getInt("VorstellungsID"),
                        rs.getInt("Saal"),
                        rs.getInt("Film"),
                        rs.getTimestamp("ZP_S"),
                        rs.getTimestamp("ZP_E")
                );
                vorstellungen.add(v);
            }
            return vorstellungen;
        } else {
            return null;
        }
    }

    public static ObservableList<Vorschau> Vorschauen(ObservableList<Vorstellung> vorstellungen) throws SQLException {
        ObservableList<Vorschau> vorschauen = FXCollections.observableArrayList();
        if (vorstellungen != null) {
            ResultSet rs = null;
            String hours = null;
            String minutes = null;
            for (int i = 0; i < vorstellungen.size(); i++) {
                System.out.println("SELECT Name FROM Film WHERE FilmID = " + vorstellungen.get(i).getFilm());
                rs = DML_DAO.executeDML("SELECT Name FROM Film WHERE FilmID = " + vorstellungen.get(i).getFilm());
                rs.next();
                System.out.println(rs.getString("Name"));
                hours = vorstellungen.get(i).getStart().getHours() <= 9 ? "0" + vorstellungen.get(i).getStart().getHours() : String.valueOf(vorstellungen.get(i).getStart().getHours());
                minutes = vorstellungen.get(i).getStart().getMinutes() <= 9 ? "0" + vorstellungen.get(i).getStart().getMinutes() : String.valueOf(vorstellungen.get(i).getStart().getMinutes());
                vorschauen.add(new Vorschau(rs.getString("Name"), hours + ":" + minutes));
            }
            return vorschauen;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}