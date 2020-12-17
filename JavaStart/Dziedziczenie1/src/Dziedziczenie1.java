import java.util.Scanner;

public class Dziedziczenie1 {
    public static void main(String argv[]){
        Scanner scanner = new Scanner(System.in);
        Tire part1 = new Tire();
        ExhaustPart part2 = new ExhaustPart();

        System.out.println("Podaj parametry zestawu opon: ");
        part1.setIdNumber(scanner.nextLine());
        part1.setModelName(scanner.nextLine());
        part1.setProducerName(scanner.nextLine());
        part1.setProductNumber(scanner.nextLine());
        part1.setSize(scanner.nextDouble());
        part1.setWidth(scanner.nextDouble());

        System.out.println("Podaj parametry układu wydechowego: ");
        part2.setIdNumber(scanner.nextLine());
        part2.setModelName(scanner.nextLine());
        part2.setProducerName(scanner.nextLine());
        scanner.nextLine();
        part2.setProductNumber(scanner.nextLine());
        part2.setEuropejskaNorma(true);

        System.out.println("Wydruk zestawu opon i układu wydechowego");
        part1.printInfo();
        part2.printInfo();
    }
}
