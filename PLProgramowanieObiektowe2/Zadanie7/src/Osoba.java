class Osoba extends NrTelefoniczny{
    String imie;
    String nazwisko;
    String adres;

    public Osoba(){
        imie = "";
        nazwisko = "";
        adres = "";
        NrTelefonu = 0;
        NrKierunkowy = 0;
    }

    public Osoba(String im, String naz, String adOs, Integer telOs, Integer kierOs){
        imie = im;
        nazwisko = naz;
        adres = adOs;
        NrTelefonu = telOs;
        NrKierunkowy = kierOs;
    }
}