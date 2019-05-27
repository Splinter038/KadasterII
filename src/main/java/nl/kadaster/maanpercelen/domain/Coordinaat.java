package nl.kadaster.maanpercelen.domain;

public class Coordinaat {
    private double longitude;
    private double latitude;

    Coordinaat(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override public String toString(){
        return "[" + this.longitude + ":" + this.latitude + "]";
    }

}
