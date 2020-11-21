import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie6 {
    static Vector<Double> WczytajWektor(String ciag){
        Scanner in = new Scanner(ciag);
        Vector<Double> wektor = new Vector<Double>();
        while(in.hasNext()) {
            if(in.hasNextDouble()) {
                wektor.add(in.nextDouble());
            }
            else {
                in.next();
            }
        }
        in.close();
        return wektor;
    }

    static Vector<Double> DodajWektor(Vector<Double> Wektor1, Vector<Double> Wektor2) throws WektoryRoznejDlugosciException {
        if(Wektor1.size() != Wektor2.size()) {
            throw new WektoryRoznejDlugosciException(Wektor1.size(), Wektor2.size());
        }
        Vector<Double> WektorWynik = new Vector<Double>(Wektor1.size());
        for(int i = 0; i < Wektor1.size(); ++i){
            WektorWynik.add(Wektor1.elementAt(i) + Wektor2.elementAt(i));
        }
        return WektorWynik;
    }

    static void ZapisWektoraDoPliku(Vector<Double> wektor) throws IOException {
        try {
            String Sciezka = "wektor.txt";
            OutputStream Wyjscie = new FileOutputStream(Sciezka);
            Writer Zapis = new OutputStreamWriter(Wyjscie);
            PrintWriter DrukarkaWyniku = new PrintWriter(Zapis);
            for (int i = 0; i < wektor.size(); ++i) {
                DrukarkaWyniku.print(wektor.elementAt(i) + " ");
            }
            System.out.println("Zapisano do pliku.");
            DrukarkaWyniku.close();
            Zapis.close();
            Wyjscie.close();
        } catch (Exception e) {
            System.out.println("Błąd odczytu, lub zapisu");
        }
    }

    static public void main(String[] args) throws IOException {
        boolean test = false;
        InputStreamReader CzytnikWejscia = new InputStreamReader(System.in);
        BufferedReader CzytnikBuforu = new BufferedReader(CzytnikWejscia);
        Vector<Double> WektorWynik = null;
        do {
            test = false;
            System.out.print("Podaj pierwszy wektor: ");
            Vector<Double> Wektor1 = WczytajWektor(CzytnikBuforu.readLine());
            System.out.print("Podaj drugi wektor: ");
            Vector<Double> Wektor2 = WczytajWektor(CzytnikBuforu.readLine());
            try {
                WektorWynik = DodajWektor(Wektor1, Wektor2);
            } catch(WektoryRoznejDlugosciException e) {
                System.out.println("Błąd: " + e.getMessage() + " " + e.Wektor1 + " =/= " + e.Wektor2);
                System.out.println("Podaj ponownie wektory.");
                test = true;
            }
        } while(test);
        ZapisWektoraDoPliku(WektorWynik);
    }
}

class WektoryRoznejDlugosciException extends Exception {
    public final int Wektor1, Wektor2;
    public WektoryRoznejDlugosciException(int w1, int w2) {
        super("Wektory nie są sobie równe.");
        this.Wektor1 = w1;
        this.Wektor2 = w2;
    }
}