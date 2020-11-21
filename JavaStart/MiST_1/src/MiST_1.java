import java.util.Scanner;

public class MiST_1 extends Calculator {
    public static void main(String argv[]){
        int a;
        int b;
        int c;
        Scanner liczba = new Scanner(System.in);
        Calculator Calc1 = new Calculator();
        System.out.println("Podaj trzy liczby: ");
        a = liczba.nextInt();
        b = liczba.nextInt();
        c = liczba.nextInt();
        System.out.println("Wynik dodawania dla trzech i dla dwóch liczb: ");
        System.out.println(Calc1.add(a, b, c));
        System.out.println(Calc1.add(a, b));
        System.out.println("Wynik odejmowania dla trzech i dla dwóch liczb: ");
        System.out.println(Calc1.subtract(a, b, c));
        System.out.println(Calc1.subtract(a, b));
    }
}
