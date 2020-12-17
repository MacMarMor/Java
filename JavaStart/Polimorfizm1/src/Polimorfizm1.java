public class Polimorfizm1 {
    public static void main(String[] argv){
        Hospital szpital = new Hospital();
        szpital.add(new Doctor("Doktor", "Lubicz", 5000, 1200));
        szpital.add(new Nurse("Basen", "Siostra", 3500, 8));
        szpital.add(new Nurse("Marta", "Basen", 3500, 10));

        System.out.println(szpital.getInfo());
    }
}