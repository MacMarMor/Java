public class Movie {
    private String movieTitle;
    private String movieType;
    private int movieTime;
    private int ageRequired;
    private int maxSeats;
    private int freeSeats;

    public Movie(){

    }

    public Movie( String movieTitle, String movieType, int movieTime, int ageRequired, int maxSeats, int freeSeats){
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
}
