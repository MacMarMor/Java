class Fruit {
    private int waga; //w gramach
    private String typOwocu;

    Fruit(){
    }
    Fruit(String typOwocu, int waga){
        this.typOwocu = typOwocu;
        this.waga = waga;
    }
    //Gettery
    public int getWaga() {
        return waga;
    }
    public String getTypOwocu() {
        return typOwocu;
    }
    //Settery
    public void setWaga(int waga) {
        this.waga = waga;
    }
    public void setTypOwocu(String typOwocu) {
        this.typOwocu = typOwocu;
    }

    String getInfo(){
        return typOwocu + " " + waga;
    }
}