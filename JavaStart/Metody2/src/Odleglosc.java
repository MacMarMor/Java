public class Odleglosc {
    double odleglosc = 0;

    Odleglosc dlugosc = new Odleglosc();

    double metryNaCentymetry(double odleglosc){
        System.out.println("Metry na centymetry: ");
        return odleglosc * 100;
    }
    double metryNaMilimetry(double odleglosc){
        System.out.println("Metry na milimetry: ");
        return odleglosc * 100 * 10;
    }
    double centymetryNaMetry(double odleglosc){
        System.out.println("Centymetry na milimetry: ");
        return odleglosc / 100;
    }
    double milimetryNaMetry(double odleglosc){
        System.out.println("Milimetry na metry: ");
        return odleglosc / 1000;
    }
}
