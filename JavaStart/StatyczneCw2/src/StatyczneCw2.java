import java.util.Scanner;

public class StatyczneCw2 {
    public static void main(String argv[]){
        Scanner scanner = new Scanner(System.in);
        final int WYBOR_WYJSCIA = 0;
        final int WYBOR_KUBEK = 1;
        final int WYBOR_LYZKA_STOLOWA = 2;
        final int WYBOR_LYZKA_DO_HERBATY = 3;
        double ilosc;
        double wynik = 0;
        int wybor = -1;

        while (wybor != 0){
            System.out.println("Podaj, czy chcesz przeliczyć na:\n0 - Wyłącz program\n1 - Szklanka/kubek\n2 - łyżeczka stołowa\n3 - łyżeczka do herbaty\nPo wybraniu przelicznika wybierz, ile tego potrzebujesz:");
            wybor = scanner.nextInt();
            scanner.nextLine();
            ilosc = scanner.nextDouble();
            switch(wybor){
                case WYBOR_WYJSCIA:
                    break;
                case WYBOR_KUBEK:
                    wynik = ilosc * Przeliczniki.getSzklanka();
                    break;
                case WYBOR_LYZKA_STOLOWA:
                    wynik = ilosc * Przeliczniki.getLyzkaStolowa();
                    break;
                case WYBOR_LYZKA_DO_HERBATY:
                    wynik = ilosc * Przeliczniki.getLyzkaDoHerbaty();
                    break;
                default:
                    System.out.println("Błąd wyboru");
            }
            System.out.println("Masz " + wynik + " ml.\n");
        }
        scanner.close();
    }
}