public class Company extends KiO1{
    static public void main(String[] args){

        KiO1 Pracownik1 = new KiO1();
        KiO1 Pracownik2 = new KiO1();
        KiO1 Pracownik3 = new KiO1();

        Pracownik1.imiePracownika = "Adam";
        Pracownik1.nazwiskoPracownika = "Niezgódka";
        Pracownik1.rokUrodzeniaPracownika = 1992;
        Pracownik1.stazPracownika = 4;

        Pracownik2.imiePracownika = "Wojtek";
        Pracownik2.nazwiskoPracownika = "Masiak";
        Pracownik2.rokUrodzeniaPracownika = 1988;
        Pracownik2.stazPracownika = 10;

        Pracownik3.imiePracownika = "Piotr";
        Pracownik3.nazwiskoPracownika = "Jaworski";
        Pracownik3.rokUrodzeniaPracownika = 1986;
        Pracownik3.stazPracownika = 14;

        System.out.println(Pracownik1.imiePracownika);
        System.out.println(Pracownik1.nazwiskoPracownika);
        System.out.println(Pracownik1.rokUrodzeniaPracownika);
        System.out.println(Pracownik1.stazPracownika);

        System.out.println(Pracownik2.imiePracownika);
        System.out.println(Pracownik2.nazwiskoPracownika);
        System.out.println(Pracownik2.rokUrodzeniaPracownika);
        System.out.println(Pracownik2.stazPracownika);

        System.out.println(Pracownik3.imiePracownika);
        System.out.println(Pracownik3.nazwiskoPracownika);
        System.out.println(Pracownik3.rokUrodzeniaPracownika);
        System.out.println(Pracownik3.stazPracownika);

    }
}
