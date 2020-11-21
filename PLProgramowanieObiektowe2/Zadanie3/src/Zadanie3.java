import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main( String[] argv ){
        try{
                int WylosowanaLiczba, LiczbaUzytkownika, proba = 0, znak, test = 1;

                Scanner in = new Scanner( System.in );

                Random r = new Random();
                WylosowanaLiczba = r.nextInt(101);

                System.out.println("Witaj w programie losującym. Zaraz wylosuje dla Ciebie liczbę do zgadniecia!");

                do{
                    System.out.println("Podaj liczbę: ");
                    LiczbaUzytkownika = in.nextInt();


                    if( LiczbaUzytkownika == WylosowanaLiczba){
                        System.out.println("Trafiłeś, że jest to liczba " + WylosowanaLiczba + " za " + proba + " razem.");
                        System.out.println("Czy chcesz zagrać jeszcze raz? 1 - Tak, jakakolwiek inna liczba - NiE");
                        znak = in.nextInt();

                        if( znak == 1){
                            test = 1;
                            WylosowanaLiczba = r.nextInt(101);
                            proba = 0;
                            //clearScreen();
                        }
                        else{
                            test = 0;
                        }
                    }
                    else if ( LiczbaUzytkownika > WylosowanaLiczba ){
                        System.out.println("Podałeś za dużą liczbę! ");
                        proba ++;
                    }
                    else{
                        System.out.println("Podałeś za małą liczbę! ");
                        proba ++;
                    }

                }while ( test == 1);

            System.out.println("Dziękuję za grę. ");

        }catch(Exception e) {
            System.out.println("Nie podałeś liczby!");
        }finally {
            //Destruktor
            System.out.println("Zrobiono");
        }
    }
}


