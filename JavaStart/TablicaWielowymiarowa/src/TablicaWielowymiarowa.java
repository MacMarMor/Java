import java.util.Random;

public class TablicaWielowymiarowa {
    public static void main(String[] argv) {
        Random generatLiczbLosowych = new Random();
        double[][] tablica = new double[3][3];
        double liczba = 0;
        double suma1_1 = 0;
        double suma1_2 = 0;
        double sumaKrawedziTablicy = 0;
        double iloczyn1_1 = 1;
        double iloczyn1_2 = 1;

        System.out.println("Zapełnienie i wyświetlenie tablicy: ");
        for (int x = 0; x < tablica.length; x++) {
            for (int y = 0; y < tablica.length; y++) {
                liczba = generatLiczbLosowych.nextDouble() * 10;
                tablica[x][y] = liczba;
                System.out.print(tablica[x][y] + " ");
            }
            System.out.println(" ");
        }

        for (int x = 0; x < tablica.length; x++) {
            for (int y = 0; y < tablica.length; y++) {
                //Przekątne
                if ((x == 0 && y == 0) || (x == 1 && y == 1) || (x == 2 && y == 2)) {
                    iloczyn1_1 *= tablica[x][y];
                }
                if ((x == 0 && y == 2) || (x == 1 && y == 1) || (x == 2 && y == 0)) {
                    iloczyn1_2 *= tablica[x][y];
                }
                //Srodki
                if ((x == 1 && y == 0) || (x == 1 && y == 1) || (x == 1 && y == 2)) {
                    suma1_1 += tablica[x][y];
                }
                if ((x == 0 && y == 1) || (x == 1 && y == 1) || (x == 1 && y == 2)) {
                    suma1_2 += tablica[x][y];
                }
                //Sumy Krawedzi
                if ((x == 0 && y == 0) || (x == 1 && y == 0) || (x == 2 && y == 0) ||
                    (x == 0 && y == 2) || (x == 1 && y == 2) || (x == 2 && y == 2) ||
                    (x == 0 && y == 2) || (x == 1 && y == 2) || (x == 2 && y == 2) ||
                    (x == 0 && y == 2) || (x == 0 && y == 1) || (x == 0 && y == 0))

                   sumaKrawedziTablicy += tablica[x][y];
            }
        }
        System.out.println("\nLiczenie sumy iloczynów przekątnych tablicy");
        System.out.println("Iloczyn 1: " + iloczyn1_1);
        System.out.println("Iloczyn 2: " + iloczyn1_2);
        System.out.println("Suma : " + (iloczyn1_1 + iloczyn1_2));

        System.out.println("\nLiczenie iloczynów sum środkowego wiersza i kolumny");
        System.out.println("Suma 1: " + suma1_1);
        System.out.println("Suma 2: " + suma1_2);
        System.out.println("Iloczyn: " + (suma1_1 * suma1_2));

        System.out.println("\nSuma wszystkich krawędzi tablicy: " + sumaKrawedziTablicy);

    }
}