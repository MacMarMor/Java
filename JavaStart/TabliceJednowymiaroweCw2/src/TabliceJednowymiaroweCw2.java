public class TabliceJednowymiaroweCw2{
    public static void main(String[] Args){
        Osoba osoba1 = new Osoba(1, 81);
        Osoba osoba2 = new Osoba(2, 50);
        Osoba osoba3 = new Osoba(3, 65);
        Osoba osoba4 = new Osoba(4, 85);
        Osoba osoba5 = new Osoba(5, 75);
        Osoba osoba6 = new Osoba(6, 120);
        Osoba osoba7 = new Osoba(7, 150);
        Osoba osoba8 = new Osoba(8, 135);

        Winda winda = new Winda();
        winda.wsiadanie(osoba1);
        winda.wsiadanie(osoba2);
        winda.wsiadanie(osoba3);
        winda.wsiadanie(osoba4);
        winda.wsiadanie(osoba5);

        winda.wysiadka();

        winda.wsiadanie(osoba6);
        winda.wsiadanie(osoba7);
        winda.wsiadanie(osoba8);
        winda.start();
        winda.wysiadka();

        winda.wsiadanie(osoba1);
        winda.wsiadanie(osoba2);
        winda.wsiadanie(osoba3);
        winda.wsiadanie(osoba4);
        winda.start();
        winda.wysiadka();

    }
}
