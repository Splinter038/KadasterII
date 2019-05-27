package nl.kadaster.maanpercelen.waardelijsten;

public enum Gewas {
    TOMAAT("Tomaat"),
    KOMKOMMER("Komkommer"),
    RADIJS("Radijs"),
    SLA("Sla"),
    PAPRIKA("Paprika");

    String roepnaam;

    Gewas(String roepnaam){
        this.roepnaam = roepnaam;
    }
}
