module com.example.kinoverwaltung {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kinoverwaltung to javafx.fxml;
    exports com.example.kinoverwaltung;
}