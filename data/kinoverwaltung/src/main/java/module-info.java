
module com.example.kinoverwaltung {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;

    opens com.example.kinoverwaltung to javafx.fxml;
    exports com.example.kinoverwaltung;
    exports util;
    opens util to javafx.fxml;
}