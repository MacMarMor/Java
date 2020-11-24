public class Kalkulator {
    private double x;
    private double y;
    private String operacja;
    double wynik;

    public Kalkulator(double x, double y, String operacja){
        this.x = x;
        this.y = y;
        this.operacja = operacja;
    }
    public double Kalkulator(){
        switch (operacja) {
            case "+":
                wynik = x + y;
                break;
            case "-":
                wynik = x - y;
                break;
            case "*":
                wynik = x * y;
                break;
            case "/":
                wynik = x / y;
                break;
            default:
                System.out.println("Nic nie wybrałeś");
        }
        return wynik;
    }
}