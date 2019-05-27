package nl.kadaster.maanpercelen.domain;

public abstract class Perceel {
    private final int ID;
    private Eigenaar huidigeEigenaar;

    Perceel(int id){
        this.ID = id;
    }

    public Eigenaar getHuidigeEigenaar(){
        return this.huidigeEigenaar;
    }

    public int getID(){
        return this.ID;
    }
}
