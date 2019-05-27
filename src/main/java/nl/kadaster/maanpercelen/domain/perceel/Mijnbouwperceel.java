package nl.kadaster.maanpercelen.domain.perceel;

import nl.kadaster.maanpercelen.domain.Opbrengst;
import nl.kadaster.maanpercelen.waardelijsten.Delfstof;
import nl.kadaster.maanpercelen.waardelijsten.Gewas;

public class Mijnbouwperceel extends Winningsgebied {

    private Delfstof delfstof;

    private Gewas gewas;

    public Mijnbouwperceel(Opbrengst opbrengst, Delfstof delfstof) {
        super(opbrengst);
        this.delfstof = delfstof;
    }

    public Delfstof getDelfstof() {
        return delfstof;
    }

    public void setDelfstof(Delfstof delfstof) {
        this.delfstof = delfstof;
    }
}
