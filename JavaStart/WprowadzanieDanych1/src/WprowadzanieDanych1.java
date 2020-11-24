import java.util.Scanner;

public class WprowadzanieDanych1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dane do kalkulatora\nPodaj pierwszą zmienna: ");
        double zmienna1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Podaj znak operacji: ");
        String operator = scan.nextLine();
        scan.nextLine();
        System.out.println("Podaj drugą zmienną: ");
        double zmienna2 = scan.nextDouble();
        Kalkulator wynik = new Kalkulator(zmienna1, zmienna2, operator);
        System.out.println("Wynik: ");
        System.out.println(wynik.Kalkulator());
        scan.close();
    }
}
