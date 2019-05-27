package nl.kadaster.maanpercelen.domain;

public class Maan {
    private final KadastraalLand kadastraalLand;

    public Maan(KadastraalLand kadastraalLand) {
        this.kadastraalLand = kadastraalLand;
    }

    public KadastraalLand getKadastraalLand(){
        return this.kadastraalLand;
    }
}
