import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;

public class Zadanie7 extends Wpis{

    @Override
    public void Opis() {
       System.out.println("Czas zacząć");
    }

    public static void main(String[] argv) {

        TreeMap<Integer, String> treemapF = new TreeMap<Integer, String>();
        TreeMap<Integer, String> treemapS = new TreeMap<Integer, String>();
        Firma[] firma = new Firma[3];
        Osoba[] osoba = new Osoba[4];

        firma[0] = new Firma("Kapusta Sp.Zoo", "ul. Dostawcza 21, 91-345 Lodz", 989373555, 42);
        firma[1] = new Firma("Kaltun Taktyczny Sp.Komandytowa", "ul. Tuszonki 25, 92-049 Brzuszki", 333333333, 34);
        firma[2] = new Firma("Kwinto Sp.Zoo", "ul. Ucha od Sledzia 81, 00-049 Warszawa", 198119850, 22);

        osoba[0] = new Osoba("Maciej", "Morawski", "ul. Czechosłowacka 17, 90-345 Lodz", 333444555, 42);
        osoba[1] = new Osoba("Adam", "Niezgódka", "ul. Podwawelska 7, 00-046 Warszawa", 567123786, 22);
        osoba[2] = new Osoba("Charlie", "Chaplin", "ul. Smieszna 42, m.3, 38-234 Poznan", 642302359, 61);
        osoba[3] = new Osoba("Jan", "Kowalski", "ul. Hutnicza 3, m. 2, 23-756", 456423900, 81);

        System.out.println("Wypis Pracownikow za pomocą System.out.println: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(osoba[i].NrTelefonu + " " + osoba[i].imie);
        }
        System.out.println("\nWypis Firm za pomocą System.out.println: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(firma[i].NrTelefonu + " " + firma[i].nazwa);
        }

        System.out.println("\n\n");
        System.out.println("Wypis Firm za pomocą TreeMapa: ");
        for(int i = 0; i < 3; i++){
            treemapF.put(firma[i].NrTelefonu, firma[i].nazwa);
        }
        System.out.println("TreeMap Firmy: " + treemapF);
        System.out.println("Wypis Osób za pomocą TreeMapa: ");
        for(int i = 0; i < 4; i++){
            treemapS.put(osoba[i].NrTelefonu, osoba[i].imie);
        }
        System.out.println("TreeMap Osoby: " + treemapS);

    }
}