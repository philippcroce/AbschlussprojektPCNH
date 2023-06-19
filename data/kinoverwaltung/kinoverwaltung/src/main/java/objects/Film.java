package objects;

public class Film {

    public Film(int ID, String Name, int Dauer) {
        this.ID = ID; this. Name = Name; this.Dauer = Dauer;
    }

    private int ID;
    private String Name;
    private int Dauer;

    public int getID() { return ID; }
    public String getName() { return Name; }
    public int getDuration() { return Dauer; }

}
