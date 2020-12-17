public class Car {
    private double poziomPaliwa;
    private int silnik;
    private int wlewPaliwa;
    private int drzwi;
    private int dzialajacySilnik;

    Car(){

    }
    Car(double poziomPaliwa, int silnik, int wlewPaliwa, int drzwi, int dzialajacySilnik){
        this.poziomPaliwa = poziomPaliwa;
        this.silnik = silnik;
        this.wlewPaliwa = wlewPaliwa;
        this.drzwi = drzwi;
        this.dzialajacySilnik = dzialajacySilnik;
    }

    //Gettery
    public double getPoziomPaliwa() {
        return poziomPaliwa;
    }

    public int getSilnik() {
        return silnik;
    }

    public int getWlewPaliwa() {
        return wlewPaliwa;
    }

    public int getDrzwi() {
        return drzwi;
    }

    public int getDzialajacySilnik() {
        return dzialajacySilnik;
    }

    //Settery
    public void setPoziomPaliwa(double poziomPaliwa) {
        this.poziomPaliwa = poziomPaliwa;
    }

    public void setSilnik(int silnik) {
        this.silnik = silnik;
    }

    public void setWlewPaliwa(int wlewPaliwa) {
        this.wlewPaliwa = wlewPaliwa;
    }

    public void setDrzwi(int drzwi) {
        this.drzwi = drzwi;
    }

    public void setDzialajacySilnik(int dzialajacySilnik) {
        this.dzialajacySilnik = dzialajacySilnik;
    }

    //METODY
    //Co się dzieje z silnikiem
    void start(double poziomPaliwa, int silnik, int wlewPaliwa, int drzwi, int dzialajacySilnik){
        if( (silnik != 0) && (poziomPaliwa >= 0) && (wlewPaliwa != 0) && (drzwi != 0) && (dzialajacySilnik != 0) ){
            System.out.println("100 - samochód udało się uruchomić");
        }
        else if(silnik == 0){
            System.out.println("200 - samochodu nie da się uruchomić z powodu awarii silnika");
        }
        else if(poziomPaliwa <= 0){
            System.out.println("300 - samochodu nie da się uruchomić z powodu braku paliwa");
        }
        else if((dzialajacySilnik == 1) && (wlewPaliwa != 0) && (drzwi == 1) ){
            System.out.println("400 - samochód udało się uruchomić, ale klapka wlewu paliwa nie jest zamknięta");
        }
        else if((dzialajacySilnik == 1) && (wlewPaliwa != 1) && (drzwi == 0) ){
            System.out.println("500 - samochód udało się uruchomić, ale drzwi lub bagażnik nie są zamknięte");
        }
        else{
            //System.out.println("JEDZIEMY!!!");
        }
    }
    //Włączamy samochód i jeździmy nim
    void status(){
        System.out.println("Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż");
    }
}