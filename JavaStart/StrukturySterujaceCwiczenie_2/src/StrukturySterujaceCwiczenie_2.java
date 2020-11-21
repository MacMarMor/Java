import java.util.Random;

public class StrukturySterujaceCwiczenie_2 {
    public static void main(String[] argv){
        int wylosowanaLiczba = 0;

        Random generator = new Random();
        wylosowanaLiczba = generator.nextInt(10000);

         if(wylosowanaLiczba < 5000){
             System.out.println("Liczba " + wylosowanaLiczba + " jest mniejsza od 5000.");
         }
         else if(wylosowanaLiczba == 5000){
             System.out.println("Liczba " + wylosowanaLiczba + " jest równa 5000.");
         }
         else{
             System.out.println("Liczba " + wylosowanaLiczba + " jest większa od 5000.");
         }

         if( (wylosowanaLiczba % 2) == 0){
             System.out.println("Liczba " + wylosowanaLiczba + " jest liczbą parzystą.");
         }
         else{
             System.out.println("Liczba " + wylosowanaLiczba + " jest liczbą nieparzystą.");
         }
    }
}