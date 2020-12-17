class Apple extends Fruit{
    private static final String TYP = "jabłkowy";
    private String odmiana;
    Apple(){

    }
    Apple(int waga, String odmiana){
        super(TYP, waga);
        this.odmiana = odmiana;
    }
    //settery
    public void setOdmiana(String odmiana) {
        this.odmiana = odmiana;
    }
    //gettery
    public String getOdmiana() {
        return odmiana;
    }

    String getInfo(){
        return (super.getInfo() + " " + odmiana);
    }
}