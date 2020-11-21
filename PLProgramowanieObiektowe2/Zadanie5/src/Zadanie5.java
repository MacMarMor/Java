import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {

    static public void main(String[] argv) throws FileNotFoundException {

        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Podaj sciezke do pliku: ");
            String FilePath = in.nextLine();
            System.out.println("Twoja ścieżka do pliku: " + FilePath);
            System.out.println("...");
            ZapisSciezki(FilePath);
            Odczyt(FilePath);

        } catch (Exception e) {
            System.out.println("\n\nBłąd zapisu sciezki do pliku, lub odczytu");
        }finally {
            //Destruktor
            System.out.println("\n\nZrobiono");
        }
    }

    //Metoda zapisu sciezki do osobnego pliku
    public static void ZapisSciezki(String sciezka) throws FileNotFoundException {
        PrintWriter ZapisSciezki = new PrintWriter("sciezka.txt");
        ZapisSciezki.println(sciezka);
        ZapisSciezki.close();
    }

    //Metoda odczytu i wypisania
    public static void Odczyt(String sciezka) throws IOException {

        Random losowa = new Random();
        int liczba = 0;

        //Odczyt z pliku
        File PlikIo = new File(sciezka);
        Scanner in = new Scanner(PlikIo);
        String tekst = in.nextLine();
        int dlugosc = tekst.length();
        System.out.println("Dlugosc: " + dlugosc);
        System.out.println(tekst);

         //tablica char na tekst z pliku
        char tablica[] = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            tablica[i] = tekst.charAt(i);
        }

        //Wypisanie tablicy charow
        System.out.println("Tablica Char: ");
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(tablica[i]);
        }

        //wypisanie tekstu z pliku w wersji skroconej
        System.out.println("\n\n Wersja 'skrócona' Char: ");
        for(int i = 0; i < dlugosc; i++){
            int pozycja = i;
            //System.in.read() - tylko enterki
            if( System.in.read()!= 0 ) {
                liczba = losowa.nextInt(((5 - 1) + 1) + 1);
                int suma = pozycja + liczba;
                for (int j = pozycja; j < suma; j++) {
                    if( suma > dlugosc ) {
                        suma = dlugosc;
                    }

                    System.out.print(tablica[j]);
                }
                System.out.print("_");
                System.out.print(" Pozycja i, zakres: " + i + "  " + pozycja + ", " + (pozycja + liczba));
                i += liczba;
            }
        }
    }
}
