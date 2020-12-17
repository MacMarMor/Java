import java.util.Scanner;

public class Dziedziczenie2 {
    public static void main(String argv[]) {
        Scanner scanner = new Scanner(System.in);
        OfflineCourse kursOffline = new OfflineCourse();
        BootcampOnline kursOnlineBootcamp = new BootcampOnline();

        System.out.println("Wypełnij dane kursu Offline: \nID:");
        kursOffline.setId(scanner.nextLine());
        System.out.println("Cena: ");
        kursOffline.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Tytuł: ");
        kursOffline.setTitle(scanner.nextLine());
        System.out.println("Opis: ");
        kursOffline.setDescription(scanner.nextLine());
        System.out.println("Miasto: ");
        kursOffline.setCity(scanner.nextLine());
        System.out.println("Liczba zajeć: ");
        kursOffline.setNumberOfLessons(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Wypełnij dane kursu Online: \nID:");
        kursOnlineBootcamp.setId(scanner.nextLine());
        System.out.println("Cena: ");
        kursOnlineBootcamp.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Tytuł: ");
        kursOnlineBootcamp.setTitle(scanner.nextLine());
        System.out.println("Opis: ");
        kursOnlineBootcamp.setDescription(scanner.nextLine());
        System.out.println("Długość wideo: ");
        kursOnlineBootcamp.setVideoLength(scanner.nextInt());
        System.out.println("Czas do końca: ");
        kursOnlineBootcamp.setTimeToFinish(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nauczyciel: ");
        kursOnlineBootcamp.setTeacher(scanner.nextLine());
        System.out.println("Konsultacje: ");
        kursOnlineBootcamp.setConsultacionHours(scanner.nextInt());

        System.out.println("Drukowanie kursów: ");
        kursOffline.showDataInfo();
        System.out.println(" ");
        kursOnlineBootcamp.showDataInfo();
    }
}
