public class Czas {
    int czas = 0;

    Czas time = new Czas();

    int godzinaNaMinuty(int czas){
        System.out.println("Godzina na minuty:");
        return czas * 60;
    }
    int minutyNaSekundy(int czas){
        System.out.println("Minuty na sekundy:");
        return czas * 60;
    }
    int sekundyNaMilisekundy(int czas){
        System.out.println("Sekundy na milisekundy:");
        return czas * 1000;
    }
}
