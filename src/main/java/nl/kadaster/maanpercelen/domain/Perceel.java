package nl.kadaster.maanpercelen.domain;

public abstract class Perceel {
    private final int ID;

    Perceel(int id){
        this.ID = id;
    }

    public int getID(){
        return this.ID;
    }
}
