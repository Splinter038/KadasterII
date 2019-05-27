package nl.kadaster.maanpercelen.domain;

import java.util.HashMap;
import nl.kadaster.maanpercelen.domain.perceel.Perceel;
public class KadastraalLand {
    private final HashMap<Integer , Perceel> percelen = new HashMap<Integer, Perceel>();

    public void addPerceel(Perceel perceel){
        percelen.put(perceel.getId(), perceel);
    }

    Perceel getPerceelByID(int ID){
        return percelen.get(ID);
    }

    public void startTransactie(Rechtspersoon koper, Rechtspersoon  verkoper, Perceel perceel) throws Exception {

        if(perceel.getEigenaar().getID() == verkoper.getID()) {
            throw new Exception("Verkoper is geen eigenaar");
        }

        perceel.setEigenaar(koper);

    }
}
