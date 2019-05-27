package nl.kadaster.maanpercelen.domain.perceel;


import nl.kadaster.maanpercelen.domain.Opbrengst;

public abstract class Winningsgebied extends Perceel {

     Opbrengst opbrengst;

    public Winningsgebied(Opbrengst opbrengst) {
        this.opbrengst = opbrengst;
    }

    public Winningsgebied(String eenheid, double waarde) {
        this.opbrengst = new Opbrengst(eenheid, waarde);
    }

    public Opbrengst getOpbrengst() {
        return opbrengst;
    }

    public void setOpbrengst(Opbrengst opbrengst) {
        this.opbrengst = opbrengst;
    }
}
