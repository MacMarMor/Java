import java.util.Scanner;

public class Algorytm2 {
    public static void main(String[] argv){
        int index = 0;
        int multi = 1;
        wczytajNext(index, multi);
    }
    public static void wczytajNext(int index, int multi){
        Scanner scanner = new Scanner(System.in);
        while (index < 5){
            System.out.println("Podaj liczbę: ");
            int next = scanner.nextInt();
            if (index < 5){
                multi *= next;
            }
            index++;
        }
        checkMulti(multi);
        scanner.close();
    }
    public static void checkMulti(int multi){
        if(multi >= 0){
            System.out.println("Nieujemna");
        }
        else{
            System.out.println("Ujemna");
        }
    }
}