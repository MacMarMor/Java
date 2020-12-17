import java.util.Scanner;

public class PetlaCw1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj, ile chcesz wczytać zmiennych:");
        int zakres = scanner.nextInt();
        int[] tablica = new int[zakres];
        for(int i = 0; i < tablica.length; i++){
            System.out.println("Podaj liczbę: ");
            tablica[i] = scanner.nextInt();
        }
        System.out.println("Podałeś następujące liczby: ");
        for(int j: tablica){
            System.out.println(j);
        }
    }
}