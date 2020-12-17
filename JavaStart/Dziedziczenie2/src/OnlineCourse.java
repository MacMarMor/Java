class OnlineCourse extends Course {
    private int videoLength;
    private int timeToFinish;

    OnlineCourse() {

    }
    OnlineCourse(String id, double price, String title, String description, int videoLength, int timeToFinish) {
        setId(id);
        setPrice(price);
        setTitle(title);
        setDescription(description);
        this.videoLength = videoLength;
        this.timeToFinish = timeToFinish;
    }
    //Settery
    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }
    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }
    //Gettey
    public int getVideoLength() {
        return videoLength;
    }
    public int getTimeToFinish() {
        return timeToFinish;
    }
    void showDataInfo(){
        System.out.println("Id Kursu: " + getId() + "\n" +
                "Cena kursu: " + getPrice() + "\n" +
                "Kurs: " + getTitle() + "\n" +
                "Opis: " + getDescription() + "\n" +
                "Długość wideo: " + videoLength + "\n" +
                "Czas do końca: " + timeToFinish
        );
    }
}