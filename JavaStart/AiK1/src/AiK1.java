public class AiK1 {
    public static void main(String[] argv){

        Person osoba1 = new Person();
        osoba1.imie = "Jan";
        osoba1.nazwisko = "Kowalski";
        osoba1.pesel = "2403950994";
        AdresZamieszkania add1 = new AdresZamieszkania();
        add1.zamieszkanie = osoba1;
        add1.adresZamieszkania = "ul.Piotrkowska 101, m5, 91-340 Lodz";
        AdresZameldowania addZamel1 = new AdresZameldowania();
        addZamel1.zameldowanie = osoba1;
        addZamel1.adresZameldowania = "ul.Piotrkowska 101, m5, 91-340 Lodz";
        KontoBankowe kb1 = new KontoBankowe();
        kb1.owner = osoba1;
        kb1.balance = 100000.0;

        Person osoba2 = new Person();
        osoba2.imie = "Marta";
        osoba2.nazwisko = "Kowalska";
        osoba2.pesel = "2203950994";
        AdresZamieszkania add2 = new AdresZamieszkania();
        add2.zamieszkanie = osoba2;
        add2.adresZamieszkania = "ul.Piotrkowska 101, m5, 91-340 Lodz";
        AdresZameldowania addZamel2 = new AdresZameldowania();
        addZamel2.zameldowanie = osoba2;
        addZamel2.adresZameldowania = "ul.Obywatelska 5, m7, 90-340 Lodz";
        KontoBankowe kb2 = new KontoBankowe();
        kb2.owner = osoba2;
        kb2.balance = 75000.0;


        System.out.println("Osoba 1");
        System.out.println(osoba1.imie + " " + osoba1.nazwisko);
        System.out.println("Zamieszkały w: " + add1.adresZamieszkania);
        System.out.println("Zameldowany w: " + addZamel1.adresZameldowania);
        System.out.println("Posiada konto bankowe o wartości (w zł): " + kb1.balance);
        System.out.println("Osoba 2");
        System.out.println(osoba2.imie + " " + osoba2.nazwisko);
        System.out.println("Zamieszkały w: " + add2.adresZamieszkania);
        System.out.println("Zameldowany w: " + addZamel2.adresZameldowania);
        System.out.println("Posiada konto bankowe o wartości (w zł): " + kb2.balance);





    }
}
