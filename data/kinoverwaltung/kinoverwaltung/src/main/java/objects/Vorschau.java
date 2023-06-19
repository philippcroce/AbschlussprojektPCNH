package objects;

import javafx.beans.property.SimpleStringProperty;

public class Vorschau {

    public Vorschau(String film, String start) {
        this.film = new SimpleStringProperty(film);
        this.start = new SimpleStringProperty(start);
    }

    public SimpleStringProperty film;
    public SimpleStringProperty start;

    public SimpleStringProperty filmProperty() {
        return film;
    }
    public SimpleStringProperty startProperty() {
        return start;
    }
}
