import java.util.Scanner;

public class Uniwersytet {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Licznba studentów przed zapisami " + Student.getLiczbaStudentow());

        Student student1 = new Student("Maciej", "Morawski", "209399");
        Student student2 = new Student("Jan", "Niemyski", "2347556");

        System.out.println("Student1: ");
        System.out.println( student1.getImieStudenta() + " " + student1.getNazwiskoStudenta() + " " + student1.getIndexStudenta());
        System.out.println("Student2: ");
        System.out.println( student2.getImieStudenta() + " " + student2.getNazwiskoStudenta() + " " + student2.getIndexStudenta());
        System.out.println("Licznba studentów po zapisach " + Student.getLiczbaStudentow());

        scanner.close();
    }
}