//Nie wpadlem na pomysl z przypisaniem danych do klasy
public class MetodyIKonstruktory2 {
    double woda = 0;
    double ropa = 0;

    MetodyIKonstruktory2(double w, double r){
        woda = w;
        ropa = r;
    }

    public static void main( String[] argv ){
        int ogladanieTV = 5;
        MetodyIKonstruktory2 dom = new MetodyIKonstruktory2(10000, 10000);
        dom.takeShower();
        System.out.println(dom.returnInfo());
        dom.takeBath();
        System.out.println(dom.returnInfo());
        dom.boilWater();
        System.out.println(dom.returnInfo());
        dom.makeDinner();
        System.out.println(dom.returnInfo());
        dom.watchTv(ogladanieTV);
        System.out.println(dom.returnInfo());
    }

    void takeShower(){
        System.out.println("Bierzemy prysznic:");
        woda -= 48;
    }
    void takeBath(){
        System.out.println("Kąpiel w wannie:");
        woda -= 86;
    }
    void makeDinner(){
        System.out.println("Robimy obiad:");
        woda -= 4;
        ropa -= 0.1;
    }
    void boilWater(){
        System.out.println("Gotujemy wodę:");
        woda -= 0.5;
        ropa -= 0.05;
    }
    void watchTv(int czasOgladania){
        System.out.println("Oglądamy TV przez " + czasOgladania + " godzin:");
        ropa -= czasOgladania * 0.06;
    }

    String returnInfo(){
        return "Stan wody: " + woda + " litrów. Stan ropy: " + ropa + " litrów.";
    }
}