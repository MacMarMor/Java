class Doctor extends Person {
    private double premiaPracownika;

    Doctor(String imiePracownika, String nazwiskoPracownika, double wyplataPracownika, double premiaPracownika) {
        super(imiePracownika, nazwiskoPracownika, wyplataPracownika);
        this.premiaPracownika = premiaPracownika;
    }

    //settery
    public void setPremiaPracownika(double premiaPracownika) {
        this.premiaPracownika = premiaPracownika;
    }
    //gettery
    public double getPremiaPracownika() {
        return premiaPracownika;
    }

    public String getInfo(){
        return super.getInfo() + ", Wypłata: " + premiaPracownika;
    }
}