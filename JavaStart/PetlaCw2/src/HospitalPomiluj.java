import java.util.Scanner;

public class HospitalPomiluj {
    public static void main(String argv[]) {
        final int dodajPacjenta = 0;
        final int drukujPacjenta = 1;
        final int wyjscieZProgramu = 2;
        Scanner scanner = new Scanner(System.in);
        int opcja = 2137;

        Szpital szpital = new Szpital();

        while (opcja != 2) {
            //Menu switcha
            System.out.println("Wybierz, co chcesz zrobić!");
            System.out.println("0 - dodaj pacjenta do kolejki\n1 - pokaż kolejkę\n2 - zakończ program");
            opcja = scanner.nextInt();
            scanner.nextLine();

            switch(opcja){
                //Dodaj pacjenta
                case dodajPacjenta:
                    Pacjent pacjent = new Pacjent();
                    System.out.println("Podaj imie pacjenta:");
                    pacjent.setImie(scanner.nextLine());
                    System.out.println("Podaj nazwisko pacjenta:");
                    pacjent.setNazwisko(scanner.nextLine());
                    System.out.println("Podaj numer PESEL:");
                    pacjent.setiD(scanner.nextLine());
                    szpital.addPacjenta(pacjent);
                    break;
                //Pokaż ilu jest zapisanych pacjentów do kolejki
                case drukujPacjenta:
                    szpital.printPatients();
                    break;
                //Wychodzimy z programu
                case wyjscieZProgramu:
                    System.out.println("Wychodzę z programu.");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
        scanner.close();
    }
}
