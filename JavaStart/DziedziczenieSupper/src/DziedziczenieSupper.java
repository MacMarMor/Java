import java.util.Scanner;

public class DziedziczenieSupper {
    public static void main(String[] argv){
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        addJabko(apple1);
        addJabko(apple2);

        pokazJablko(apple1);
        pokazJablko(apple2);
    }
    static Apple addJabko(Apple apple ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj informacje o jabłku1:");
        apple.setTypOwocu("jabłkowy");
        System.out.println("Podaj odmiane:");
        apple.setOdmiana(scanner.nextLine());
        System.out.println("Podaj wagę (w gramach):");
        apple.setWaga(scanner.nextInt());
        return apple;
    }
    static void pokazJablko (Apple apple){
        System.out.println("Drukowanie danych:");
        System.out.println(apple.getInfo());
    }
}