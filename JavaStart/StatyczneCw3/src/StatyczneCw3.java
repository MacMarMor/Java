import java.util.Scanner;

public class StatyczneCw3 {
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        Car samochod = new Car();
        int podroz = 1;

        while (podroz != 0){
            System.out.println("Podaj parametry do pojazdu.\n" +
                    " Poziom paliwa, sprawnosc silnika, zamkniecie wlewu paliwa, zamkniecie drzwi, prace silnika");
            samochod.setPoziomPaliwa(scanner.nextDouble());
            samochod.setSilnik(scanner.nextInt());
            samochod.setWlewPaliwa(scanner.nextInt());
            samochod.setDrzwi(scanner.nextInt());
            samochod.setDzialajacySilnik(scanner.nextInt());

            samochod.start(samochod.getPoziomPaliwa(), samochod.getSilnik(), samochod.getWlewPaliwa(), samochod.getDrzwi(), samochod.getDzialajacySilnik());
            System.out.println("Jedziesz dalej? 0 - nie, jakakolwiek liczba - tak");
            podroz = scanner.nextInt();
        }
    }
}


