package nl.kadaster.maanpercelen.domain.perceel;

import nl.kadaster.maanpercelen.domain.perceel.Perceel;

public class Woonperceel extends Perceel {

    private int inwonersCapaciteit;

    public int getInwonersCapaciteit() {
        return inwonersCapaciteit;
    }

    public void setInwonersCapaciteit(int inwonersCapaciteit) {
        this.inwonersCapaciteit = inwonersCapaciteit;
    }
}
