class BootcampOnline extends OnlineCourse{
    private String teacher;
    private int consultacionHours;

    BootcampOnline() {

    }
    BootcampOnline(String id, double price, String title, String description,
                   int videoLength, int timeToFinish, String teacher, int consultacionHours) {
        setId(id);
        setPrice(price);
        setTitle(title);
        setDescription(description);
        setVideoLength(videoLength);
        setTimeToFinish(timeToFinish);
        this.teacher = teacher;
        this.consultacionHours  = consultacionHours;
    }
    //Settery
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public void setConsultacionHours(int consultacionHours) {
        this.consultacionHours = consultacionHours;
    }
    //Gettery
    public String getTeacher() {
        return teacher;
    }
    public int getConsultacionHours() {
        return consultacionHours;
    }
    void showDataInfo(){
        System.out.println("Id Kursu; " + getId() + "\n" +
                "Cena kursu: " + getPrice() + "\n" +
                "Kurs: " + getTitle() + "\n" +
                "Opis: " + getDescription() + "\n" +
                "Długość wideo: " + getVideoLength() + "\n" +
                "Czas do końca: " + getTimeToFinish() + "\n" +
                "Nauczyciel: " + teacher + "\n" +
                "Konsultacje: " + consultacionHours
        );
    }
}
