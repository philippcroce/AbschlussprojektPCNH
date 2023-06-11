package Buchen;

import com.example.kinoverwaltung.main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Buchen {


    public void buchen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("../com/example/kinoverwaltung/buchen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Kinoverwaltung by Noah Horeis & Philipp Croce");
        stage.setScene(scene);
        stage.show();
    }
}