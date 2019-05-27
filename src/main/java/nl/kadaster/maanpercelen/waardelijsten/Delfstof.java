package nl.kadaster.maanpercelen.waardelijsten;

public enum Delfstof {
    HELIUM("Helium-3"),
    IRIDIUM("Iridium"),
    REGOLIET("regoliet"),
    GOUD("Goud"),
    PALLADIUM("Palladium"),
    PLATINA("Platina");

    String roepnaam;

    Delfstof(String roepnaam){
        this.roepnaam = roepnaam;
    }
}
