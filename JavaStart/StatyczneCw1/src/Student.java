public class Student {
    private String imieStudenta;
    private String nazwiskoStudenta;
    private String indexStudenta;
    private static int LICZBA_STUDENTOW = 0;
    Student(){

    }

    Student(String imieStudenta, String nazwiskoStudenta, String indexStudenta){
        this.imieStudenta = imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
        this.indexStudenta = indexStudenta;
        LICZBA_STUDENTOW++;
    }

    //Settery
    public void setImieStudenta(String imieStudenta) {
        this.imieStudenta = imieStudenta;
    }

    public void setNazwiskoStudenta(String nazwiskoStudenta) {
        this.nazwiskoStudenta = nazwiskoStudenta;
    }

    public void setIndexStudenta(String indexStudenta) {
        this.indexStudenta = indexStudenta;
    }

    //Gettery
    public String getImieStudenta() {
        return imieStudenta;
    }

    public String getNazwiskoStudenta() {
        return nazwiskoStudenta;
    }

    public String getIndexStudenta() {
        return indexStudenta;
    }

    public static int getLiczbaStudentow() {
        return LICZBA_STUDENTOW;
    }
}