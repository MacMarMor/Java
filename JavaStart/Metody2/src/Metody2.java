public class Metody2 {
    public static void main(String[] argv){
        int czas = 14;
        double odleglosc = 20;

        Odleglosc dlugosc = new Odleglosc();
        Czas time = new Czas();

        System.out.println( dlugosc.centymetryNaMetry( odleglosc ) );
        System.out.println( dlugosc.metryNaCentymetry( odleglosc ) );
        System.out.println( dlugosc.metryNaMilimetry(odleglosc ) );
        System.out.println( dlugosc.milimetryNaMetry( odleglosc ) );

        System.out.println( time.godzinaNaMinuty(czas) );
        System.out.println( time.minutyNaSekundy(czas) );
        System.out.println( time.sekundyNaMilisekundy(czas) );
    }
}
