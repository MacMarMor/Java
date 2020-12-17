class Course {
    private String id;
    private double price;
    private String title;
    private String description;

    Course(){

    }
    Course(String id, double price, String title, String description) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.description = description;
    }
    //Settery
    public void setId(String id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    //Gettery
    public String getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    void showDataInfo(){
        System.out.println("Id Kursu: " + id + "\n" +
                            "Cena kursu: " + price + "\n" +
                            "Kurs: " + title + "\n" +
                            "Opis: " + description
        );
    }
}