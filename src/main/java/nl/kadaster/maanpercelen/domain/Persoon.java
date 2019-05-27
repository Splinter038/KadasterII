package nl.kadaster.maanpercelen.domain;

public class Persoon {
    private final int ID;
    private String naam;
    private String nationaliteit;

    Persoon(int ID){
        this.ID = ID;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
    }

    public int getID() {
        return ID;
    }

    public String getNaam() {
        return naam;
    }

    public String getNationaliteit() {
        return nationaliteit;
    }


}
