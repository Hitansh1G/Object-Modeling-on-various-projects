package MovieBookingApplication;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Cinema{
    private String cinnemaId;
    private HashMap<String, ArrayList<String>> moviesandshow;

    public Cinema(String cinnemaId, HashMap<String, ArrayList<String>> movies) {
        this.cinnemaId = cinnemaId;
        this.moviesandshow = movies;   
    }

    // public String getCinnemaId() {
    //     return cinnemaId;
    // }

    // public HashMap<String, ArrayList<String>> getMovies() {
    //     return moviesandshow;
    // }

    public void addMovie(String movieId , String show){
        if(moviesandshow.containsKey(movieId)){
            moviesandshow.get(movieId).add(show);
        }else{
            ArrayList<String> shows = new ArrayList<>();
            shows.add(show);
            moviesandshow.put(movieId, shows);
        }
    }

    // Method to get the shows of a movie in a cinema
    public ArrayList<String> getShows(String movieId){
        if(moviesandshow.containsKey(movieId)){
            return moviesandshow.get(movieId);
        }else{
            return null;
        }
    }

}
