public class Termometr {
    private double aktualnaTemperatura = 0;
    private double oczekiwanaTemperatura = 0;
    private double zwracanaTemperatura = 0;

    Termometr(){

    }
    Termometr(double aktualnaTemperatura, double oczekiwanaTemperatura){
        this.aktualnaTemperatura = aktualnaTemperatura;
        this.oczekiwanaTemperatura = oczekiwanaTemperatura;
    }

    double wzroslTemperatura(double aktualnaTemperatura, double oczekiwanaTemperatura){
        while(aktualnaTemperatura != oczekiwanaTemperatura){
            System.out.println("Aktualna temperatura: " + aktualnaTemperatura);
            aktualnaTemperatura += 0.5;
        }
        return zwracanaTemperatura = aktualnaTemperatura;
    }
    double spadekTemperatura(double aktualnaTemperatura, double oczekiwanaTemperatura){
        while(aktualnaTemperatura != oczekiwanaTemperatura){
            System.out.println("Aktualna temperatura: " + aktualnaTemperatura);
            aktualnaTemperatura -= 0.5;
        }
        return zwracanaTemperatura = aktualnaTemperatura;
    }

    //gettery
    public double getAktualnaTemperatura() {
        return aktualnaTemperatura;
    }

    public double getOczekiwanaTemperatura() {
        return oczekiwanaTemperatura;
    }

    //settery
    public void setAktualnaTemperatura(double aktualnaTemperatura) {
        this.aktualnaTemperatura = aktualnaTemperatura;
    }

    public void setOczekiwanaTemperatura(double oczekiwanaTemperatura) {
        this.oczekiwanaTemperatura = oczekiwanaTemperatura;
    }
}
