import java.util.Scanner;

public class PetleCw1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj, ile chcesz wczytać zmiennych:");
        int zakres = scanner.nextInt();
        int suma = 0;
        while(zakres-- > 0){
            System.out.println("Podaj liczbę: ");
            suma += scanner.nextInt();
        }
        System.out.println("Suma następujących liczb: " + suma);
    }
}