import java.util.Date;

public class Movie extends Item {

    private String director;
    private String cast;

    public Movie(String title, String genre, Date releaseDate, int id, int rentalFee, boolean available,
                 String director, String cast) {

        super(title, genre, releaseDate, id, rentalFee, available);

        this.director = director;
        this.cast = cast;

    }

    public static int getId(){
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public void rentMovie(Customer customer){

    }

    public void returnMovie(){

    }
}
