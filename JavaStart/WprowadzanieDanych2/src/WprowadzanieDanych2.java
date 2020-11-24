import java.util.Random;
import java.util.Scanner;

public class WprowadzanieDanych2 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz, co wypadnie, orzeł, czy reszka?\n0 - reszka\n1 - orzeł");
        int moneta = scanner.nextInt();
        if (moneta == 0){
            moneta = 0;
        }
        else{
            moneta = 1;
        }
        int rzut = random.nextInt(2);
        if ( (rzut == 1) && (moneta == 1) ){
            System.out.println("Brawo! Trafiłeś orła.");
        }
        else if ( (rzut == 0) && (moneta == 0) ){
            System.out.println("Brawo! Trafiłeś reszke.");
        }
        else{
            System.out.println("Przykro mi, tym razem nie trafiłeś");
        }
        scanner.close();
    }
}
