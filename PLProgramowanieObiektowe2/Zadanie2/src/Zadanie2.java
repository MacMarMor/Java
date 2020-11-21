import java.util.Scanner;

public class Zadanie2 {
        public static void main( String[] argv ) {
            try {
                Scanner in = new Scanner(System.in);

                int a, b, rozmiar;
                String tekst;

                System.out.println("Podaj dwie liczby (początek i koniec), a następnie ciąg znaków (np. 2 4 Witaj)");
                a = in.nextInt();
                b = in.nextInt();
                tekst = in.nextLine();

                if( ( a < 0 ) || ( b < 0 ) ){
                    System.out.println("Podałeś liczby mniejsze od 0. Popraw!");
                }
                else if ( a > b ){
                    System.out.println("Początek nie może być większy od końca!");
                }
                else{
                    //System.out.println("Podałeś dobre dane.");
                    rozmiar = tekst.length();
                    //System.out.println("Rozmiar tesktu wynosi: " + rozmiar);

                    if( rozmiar < b ){
                        System.out.println("Wypadasz poza zakres! Popraw numer ostatniego znaku i/lub napisz dłuższy tekst.");
                    }
                    else{
                        System.out.println( "Wypiszę: " + tekst.substring( a, b ) );
                    }
                }


            }catch(Exception e) {
                System.out.println("Pomyliłeś kolejność!!! Najpierw liczby, później tekst. Spróbuj jeszcze raz.");
            }finally {
                System.out.println("Zrobiono");
            }
        }
}
