public class MiST_2 {
    public static void main(String[] argv){
        System.out.println("Rzucamy kosteczką (kilka rzutów): ");
        Dice rzutKostka = new Dice();
        rzutKostka.roll();
        rzutKostka.rollInfo();
        rzutKostka.roll();
        rzutKostka.rollInfo();
        rzutKostka.roll();
        rzutKostka.rollInfo();
    }
}
