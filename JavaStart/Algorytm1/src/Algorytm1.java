import java.util.Scanner;

public class Algorytm1 {
    public static void main(String[] argv){
        int suma = 0;
        getLiczba(suma);
    }

    private static void getLiczba(int suma){
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        while (liczba <= 100){
            suma += liczba;
            System.out.println("Podaj liczbę całkowitą:");
            liczba = scanner.nextInt();
        }
        czyParzysta(suma);
    }

    private static void czyParzysta(int suma){
        if(suma % 2 == 0){
            System.out.println("Parzysta");
        }
        else{
            System.out.println("Nieparzysta");
        }
    }
}