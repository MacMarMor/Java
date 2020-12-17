class OfflineCourse extends Course {
    private String city;
    private  int numberOfLessons;

    OfflineCourse() {

    }
    OfflineCourse(String id, double price, String title, String description, String city, int numberOfLessons){
        setId(id);
        setPrice(price);
        setTitle(title);
        setDescription(description);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }
    //Settery
    public void setCity(String city) {
        this.city = city;
    }
    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }
    //Gettery
    public String getCity() {
        return city;
    }
    public int getNumberOfLessons() {
        return numberOfLessons;
    }
    void showDataInfo(){
        System.out.println("Id Kursu: " + getId() + "\n" +
                "Cena kursu: " + getPrice() + "\n" +
                "Kurs: " + getTitle() + "\n" +
                "Opis: " + getDescription() + "\n" +
                "Miasto: " + city + "\n" +
                "Liczba lekscji: " + numberOfLessons
        );
    }
}
