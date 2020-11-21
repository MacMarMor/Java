public class KiO3 {
    static public void main(String[] args){

        double rok;

        Plant roslina1 = new Plant();
        Plant roslina2 = new Plant();
        Plant roslina3 = new Plant();

        roslina1.nazwaRosliny = "Kaktus";
        roslina1.zapotrzebowanieWodyDlaRosliny = 0.1;
        roslina2.nazwaRosliny = "Róża";
        roslina2.zapotrzebowanieWodyDlaRosliny = 0.05;
        roslina3.nazwaRosliny = "Bluszcz";
        roslina3.zapotrzebowanieWodyDlaRosliny = 0.5;

        System.out.println("Roślina: " + roslina1.nazwaRosliny + "; Tygodniowe/Miesieczne zużycie wody: " + roslina1.zapotrzebowanieWodyDlaRosliny + "/" + roslina1.zapotrzebowanieWodyDlaRosliny * 52);
        System.out.println("Roślina: " + roslina2.nazwaRosliny + "; Tygodniowe/Miesieczne zużycie wody: " + roslina2.zapotrzebowanieWodyDlaRosliny + "/" + roslina2.zapotrzebowanieWodyDlaRosliny * 52);
        System.out.println("Roślina: " + roslina3.nazwaRosliny + "; Tygodniowe/Miesieczne zużycie wody: " + roslina3.zapotrzebowanieWodyDlaRosliny + "/" + roslina3.zapotrzebowanieWodyDlaRosliny * 52);
    }
}
