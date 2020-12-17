class Person {
    private String imiePracownika;
    private String nazwiskoPracownika;
    private double wyplataPracownika;

    Person() {

    }
    Person (String imiePracownika, String nazwiskoPracownika, double wyplataPracownika) {
        this.imiePracownika = imiePracownika;
        this.nazwiskoPracownika = nazwiskoPracownika;
        this.wyplataPracownika = wyplataPracownika;
    }

    //settery
    public void setImiePracownika(String imiePracownika) {
        this.imiePracownika = imiePracownika;
    }
    public void setNazwiskoPracownika(String nazwiskoPracownika) {
        this.nazwiskoPracownika = nazwiskoPracownika;
    }
    public void setWyplataPracownika(double wyplataPracownika) {
        this.wyplataPracownika = wyplataPracownika;
    }

    //gettery
    public String getImiePracownika() {
        return imiePracownika;
    }
    public String getNazwiskoPracownika() {
        return nazwiskoPracownika;
    }
    public double getWyplataPracownika() {
        return wyplataPracownika;
    }

    public String getInfo(){
        return "Imię: " + imiePracownika + ", Nazwisko: " + nazwiskoPracownika + ", Wypłata: " + wyplataPracownika;
    }
}