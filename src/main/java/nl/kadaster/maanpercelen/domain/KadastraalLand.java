package nl.kadaster.maanpercelen.domain;

import java.util.HashMap;

public class KadastraalLand {
    private final HashMap<Integer ,Perceel> percelen = new HashMap<Integer, Perceel>();

    public void addPerceel(Perceel perceel){
        percelen.put(perceel.getID(), perceel);
    }

    Perceel getPerceelByID(int ID){
        return percelen.get(ID);
    }
}
