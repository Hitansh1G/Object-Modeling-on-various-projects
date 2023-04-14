package MovieBookingApplication;

public abstract class Movie {
    private String movieID;
    private String name;
    private int duration;

    public Movie(String movieID, String name, int duration) {
        this.movieID = movieID;
        this.name = name;
        this.duration = duration;
    }

    public String getMovieID() {
        return movieID;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}
