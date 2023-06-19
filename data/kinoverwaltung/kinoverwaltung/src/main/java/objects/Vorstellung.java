package objects;

import java.sql.Timestamp;

public class Vorstellung {

    public Vorstellung(int ID, int saal, int film, Timestamp start, Timestamp ende) {
        this.ID = ID; this.saal = saal; this.film = film; this.start = start; this.ende = ende;
    }

    private int ID;
    private int saal;
    private int film;
    private Timestamp start;
    private Timestamp ende;

    public int getID() { return ID; }
    public int getSaal() { return saal; }
    public int getFilm() { return film; }
    public Timestamp getStart() { return start; }
    public Timestamp getEnde() { return ende; }

}
