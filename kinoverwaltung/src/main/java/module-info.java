module com.example.kinoverwaltung {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.kinoverwaltung to javafx.fxml;
    exports com.example.kinoverwaltung;
}