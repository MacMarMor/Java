import java.util.Random;

public class OperacjeNaZmiennych2 {
    public static void main(String[] argv){
        final double stalaVat = 0.23;
        double cenaBrutto1 = 0;
        double cenaBrutto2 = 0;
        double vat1 = 0;
        double vat2 = 0;

        Random rand = new Random();
        double cena1 = rand.nextInt(1000);
        double cena2 = rand.nextInt(1000);

        vat1 = cena1 * stalaVat;
        cenaBrutto1 = cena1 + vat1;
        vat2 = cena2 * stalaVat;
        cenaBrutto2 = cena2 + vat2;
        System.out.println("Cena pierwszego produktu wynosi brutto: " + cenaBrutto1 +"zł. Netto: " + cena1 + "zł. VAT: " +  vat1 );
        System.out.println("Cena drugiego produktu wynosi brutto: " + cenaBrutto2 +"zł. Netto: " + cena2 + "zł. VAT: " +  vat2 );


    }
}
