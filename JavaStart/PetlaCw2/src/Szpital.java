public class Szpital {
    private final int maxLiczbaPacjentow = 10; //maxymalna liczba pacjentów
    private Pacjent[] pacjenci = new Pacjent[maxLiczbaPacjentow]; //tablica na pacjentów
    private int aktualnaLiczbaPacjentow = 0; //aktualna liczba pacjentów

    //dodawanie pacjenta do tablicy
    public void addPacjenta(Pacjent pacjent) {
        if(aktualnaLiczbaPacjentow < maxLiczbaPacjentow){
            pacjenci[aktualnaLiczbaPacjentow] = pacjent;
            aktualnaLiczbaPacjentow++;
        }
        else{
            System.out.println("Lista zapełniona. Zapraszam na jutro!");
        }
    }

    //wyświetlanie pacjentów
    public void printPatients() {
        for(int i = 0; i < aktualnaLiczbaPacjentow; i++){
            System.out.println( pacjenci[i].getImie() + " " + pacjenci[i].getNazwisko() + " " + pacjenci[i].getiD());
        }
    }
}