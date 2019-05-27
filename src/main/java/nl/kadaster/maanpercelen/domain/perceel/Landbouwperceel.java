package nl.kadaster.maanpercelen.domain.perceel;

import nl.kadaster.maanpercelen.domain.Opbrengst;
import nl.kadaster.maanpercelen.waardelijsten.Gewas;

public class Landbouwperceel extends Winningsgebied {

    private Gewas gewas;

    public Landbouwperceel(Opbrengst opbrengst, Gewas gewas) {
        super(opbrengst);
        this.gewas = gewas;
    }

    public Gewas getGewas() {
        return gewas;
    }

    public void setGewas(Gewas gewas) {
        this.gewas = gewas;
    }
}
