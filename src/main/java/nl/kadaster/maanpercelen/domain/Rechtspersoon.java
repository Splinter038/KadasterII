package nl.kadaster.maanpercelen.domain;

public class Rechtspersoon {

    private final int ID;
    private String naam;

    Rechtspersoon(int ID){
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
