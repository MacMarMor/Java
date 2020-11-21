import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

public class Zadanie4_1 {

    static int TYSIADZNAKOWDOPLIKU = 1000;
    static int ASCII_A = 32;
    static int ASCII_Z = 126;

    public static void main(String[] argv) throws FileNotFoundException {
        try {
            int i = 0, NumerWylosowanegoZnaku = 0;
            Random r = new Random();
            char[] TablicaDoZapisu = new char[TYSIADZNAKOWDOPLIKU];
            for (i = 0; i < TYSIADZNAKOWDOPLIKU; ++i) {
                NumerWylosowanegoZnaku = r.nextInt(ASCII_Z - ASCII_A + 1) + ASCII_A;
                TablicaDoZapisu[i] = (char) NumerWylosowanegoZnaku;
            }
                /*
                for (i = 0; i < TYSIADZNAKOWDOPLIKU; i++) {
                    System.out.print(TablicaDoZapisu[i]);
                }
                */
            System.out.println("Metoda zapisu i odczytu Io :");
            MetodaZapisIo(TablicaDoZapisu);
            MetodaOdczytIo(TablicaDoZapisu);
            System.out.println("\n\nMetoda zapisu i odczytu Nio :");
            MetodaZapiszNio(TablicaDoZapisu);
            MetodaOdczytuNio(TablicaDoZapisu);
            System.out.println("\nChodzi o to, że pakiet NIO jest szybszy o około 30-40 ms od pakietu Io.");

        } catch (Exception e) {
            System.out.println("Błąd odczytu, lub zapisu");
        }
    }

    public static void MetodaZapisIo(char[] s) throws FileNotFoundException {

        long StartZapisuIo = System.currentTimeMillis();
        PrintWriter ZapisIo = new PrintWriter("PlikIo.txt");
        ZapisIo.println(s);
        ZapisIo.close();
        long KoniecZapisuIo = System.currentTimeMillis();

        System.out.println("Czas zapisu Io: " + (KoniecZapisuIo - StartZapisuIo + 1) + " ms.");
    }

    public static void MetodaOdczytIo(char[] s) throws FileNotFoundException {

        long StartOdczytuIo = System.currentTimeMillis();
        File PlikIo = new File("PlikIo.txt");
        Scanner in = new Scanner(PlikIo);
        String tekst = in.nextLine();
        System.out.println(tekst);
        long KoniecOdczytuIo = System.currentTimeMillis();

        System.out.println("Czas odczytu Io: " + (KoniecOdczytuIo - StartOdczytuIo + 1) + " ms.");
    }

    public static void MetodaZapiszNio(char[] s) throws IOException {

        long StartZapisuNio = System.currentTimeMillis();
        Path PlikNio = Paths.get("PlikNio.txt");
        FileChannel ZapisNio = FileChannel.open(PlikNio, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        ByteBuffer BitowyBuforZapisuNio = ByteBuffer.allocate(s.length * 2);
        CharBuffer CharowyBuforZapisuNio = BitowyBuforZapisuNio.asCharBuffer();
        CharowyBuforZapisuNio.put(s);
        ZapisNio.write(BitowyBuforZapisuNio);
        ZapisNio.close();
        long KoniecZapisuNio = System.currentTimeMillis();
        System.out.println("Czas zapisu Nio: " + (KoniecZapisuNio - StartZapisuNio) + " ms.");
    }

    public static void MetodaOdczytuNio(char[] s) throws IOException {

        long StartOdczytuNio = System.currentTimeMillis();
        Path PlikNio = Paths.get("PlikNio.txt");
        FileChannel OdczytNio = FileChannel.open(PlikNio, StandardOpenOption.READ);
        ByteBuffer BitowyBuforOdczytuNio = ByteBuffer.allocate((int) OdczytNio.size());
        CharBuffer CharowyBuforOdczytuNio = BitowyBuforOdczytuNio.asCharBuffer();
        OdczytNio.read(BitowyBuforOdczytuNio);
        OdczytNio.close();
        char[] Tablica = new char[CharowyBuforOdczytuNio.length()];
        CharowyBuforOdczytuNio.get(Tablica);
        System.out.println(Tablica);
        long KoniecOdczytuNio = System.currentTimeMillis();

        System.out.println("Czas odczytu Nio: " + (KoniecOdczytuNio - StartOdczytuNio) + " ms.");
    }
}
