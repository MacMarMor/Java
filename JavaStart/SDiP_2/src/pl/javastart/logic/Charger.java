package pl.javastart.logic;

import pl.javastart.model.Telephone;

public class Charger {
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
