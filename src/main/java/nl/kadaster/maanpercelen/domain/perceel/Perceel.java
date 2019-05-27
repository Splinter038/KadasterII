package nl.kadaster.maanpercelen.domain.perceel;

import nl.kadaster.maanpercelen.domain.Coordinaat;
import nl.kadaster.maanpercelen.domain.Rechtspersoon;

public abstract class Perceel {

    private Rechtspersoon eigenaar;
    private int id;
    private Coordinaat locatie;
    private Double grootte;
    private Coordinaat[] grens;
    private boolean heeftBeperkingen;

    public Rechtspersoon getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Rechtspersoon eigenaar) {
        this.eigenaar = eigenaar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coordinaat getLocatie() {
        return locatie;
    }

    public void setLocatie(Coordinaat locatie) {
        this.locatie = locatie;
    }

    public Double getGrootte() {
        return grootte;
    }

    public void setGrootte(Double grootte) {
        this.grootte = grootte;
    }

    public Coordinaat[] getGrens() {
        return grens;
    }

    public void setGrens(Coordinaat[] grens) {
        this.grens = grens;
    }

    public boolean isHeeftBeperkingen() {
        return heeftBeperkingen;
    }

    public void setHeeftBeperkingen(boolean heeftBeperkingen) {
        this.heeftBeperkingen = heeftBeperkingen;
    }
}
