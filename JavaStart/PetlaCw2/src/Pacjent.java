public class Pacjent {
    private String imie;
    private String nazwisko;
    private String iD;

    //pustry konstruktor
    Pacjent(){

    }
    //konstruktor z this
    Pacjent(String imie, String nazwisko, String iD){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.iD = iD;
    }

    //Getery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getiD() {
        return iD;
    }

    //Setery
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
}
