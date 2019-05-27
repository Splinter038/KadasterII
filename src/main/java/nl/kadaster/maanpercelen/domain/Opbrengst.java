package nl.kadaster.maanpercelen.domain;

public class Opbrengst {
    private double waarde;
    private String eenheid;

    public Opbrengst(String eenheid, double waarde) {
        this.eenheid = eenheid;
        this.waarde = waarde;
    }


}
