import java.util.Scanner;

public class PetlaCw3 {
    public static void main(String argv[]){
        Scanner scanner = new Scanner(System.in);
        Termometr termometr = new Termometr();
        final int zakonczProgram = 0;
        final int kontynuujProgram = 1;
        double wynikTemperatury = 0;
        int opcja = 2137;

        //Pętla do zabawy z termometrem
        while(opcja != 0){
            System.out.println("Wybierz opcje:");
            System.out.println("0 - zakończ program\n1 - kontynuuj");
            opcja = scanner.nextInt();

            switch(opcja){
                case zakonczProgram:
                    System.out.println("Dziękuje za uwagę. Wyłączam program");
                    break;
                case kontynuujProgram:
                    System.out.println("Podaj temperaturę aktualną: ");
                    termometr.setAktualnaTemperatura(scanner.nextDouble());
                    System.out.println("Podaj temperaturę oczekiwaną");
                    termometr.setOczekiwanaTemperatura(scanner.nextDouble());

                    if(termometr.getAktualnaTemperatura() < termometr.getOczekiwanaTemperatura()){
                        wynikTemperatury = termometr.wzroslTemperatura(termometr.getAktualnaTemperatura(), termometr.getOczekiwanaTemperatura());
                    }
                    else{
                        wynikTemperatury = termometr.spadekTemperatura(termometr.getAktualnaTemperatura(), termometr.getOczekiwanaTemperatura());
                    }
                    break;
                default:
                    System.out.println("Zły wybór! Wybierz jeszcze raz");
            }
            if (opcja != 0)
                System.out.println("Osiągnięto temperaturę docelową " + wynikTemperatury + " stopni.");
        }
        scanner.close();
    }
}