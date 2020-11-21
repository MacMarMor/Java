import java.util.Random;

public class OperacjeNaZmiennych1 {
    public static void main(String[] argv){
        Random rand = new Random();
        int liczba1 = rand.nextInt(30);
        int liczba2 = rand.nextInt(30);

        System.out.println("Czy " + liczba1 + " jest większa od " + liczba2 + " ?");
        System.out.println(liczba1 > liczba2);
        System.out.println("Czy " + liczba1 + " pomnożona przez 2 jest większa od " + liczba2 + " ?");
        System.out.println( ( liczba1 * 2 ) > liczba2);
        System.out.println("Czy " + liczba2 + " jest mniejsze od sumy liczb " + liczba1 + "+3 i jednocześnie większe od " + liczba1 + " pomniejszonego o 2 ?");
        System.out.println( ( ( liczba2 <  ( liczba1 + 3 ) ) && ( liczba2 > (liczba1 - 2) ) ) );
        System.out.println("Czy iloczyn liczb " + liczba1 + " i " + liczba2 + " jest parzysty?");
        System.out.println( (liczba1 * liczba2) % 2 == 0);
    }
}
