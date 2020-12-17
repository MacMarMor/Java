class Nurse extends Person {

    private double nadgodziny;

    Nurse() {

    }
    Nurse(String imiePracownika, String nazwiskoPracownika, double wyplataPracownika, double nadgodziny) {
        super(imiePracownika, nazwiskoPracownika, wyplataPracownika);
        this.nadgodziny = nadgodziny;
    }

    //settery
    public void setNadgodziny(double nadgodziny) {
        this.nadgodziny = nadgodziny;
    }
    //gettery
    public double getNadgodziny() {
        return nadgodziny;
    }

    public String getInfo(){
        return super.getInfo() + ", Nadgodziny: " + nadgodziny;
    }
}