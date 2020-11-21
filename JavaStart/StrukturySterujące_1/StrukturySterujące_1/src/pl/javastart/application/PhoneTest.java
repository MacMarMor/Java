package pl.javastart.application;

import pl.javastart.model.Telephone;
import pl.javastart.logic.Charger;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.getBrand()
                + " " + telephone.getBrand()
                + ", bateria: " + telephone.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");

        Charger ch1 = new Charger();
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        ch1.charge(telephone);
        System.out.println("Telefon po naładowaniu");
        System.out.println(telephone.returInfo());


    }
}