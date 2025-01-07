import java.util.ArrayList;

public class CinemaBookingSystem {

    private static ArrayList<Movie> movies ;
    private Movie sampleMovie1;      //This is created only for the purpose of initialisation and to avoid error of empty collection

    public CinemaBookingSystem(){
        this.movies.add(sampleMovie1);

    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public static Movie findMovie(String name){
        for(Movie s: movies){
            if(s.getName().equals(name)){
                System.out.println("The movie "+ name + " Exists");
                return s;
            }
        }
        System.out.println("The movie does not exist");
        return null;
    }

    public void removeMovie(String name){
        movies.remove(findMovie(name));
    }
}

