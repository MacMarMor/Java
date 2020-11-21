public class Calculate {
    public static void main(String[] argv){
        double zmienna1 = 5;
        double zmienna2 = 8;

        Calculator operacja = new Calculator();
        System.out.println( operacja.add(zmienna1, zmienna2) );
        System.out.println( operacja.substract(zmienna1, zmienna2) );
        System.out.println( operacja.multiply(zmienna1, zmienna2) );
        System.out.println( operacja.divide(zmienna1, zmienna2) );
    }
}
