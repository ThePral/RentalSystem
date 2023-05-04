import java.util.ArrayList;
import java.util.List;

public class RentalStore {

    private List<Movie> movies = new ArrayList<Movie>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void register(Customer customer){
        this.customers.add(customer);
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);

    }

    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }

    public List<Movie> getAvailableMovies(){
        return movies;
    }

    public void rentMovie(Movie movie, Customer customer){
        for (Movie movie1: movies){
            if (movie1 == movie) {
                movie.rentMovie(customer);
                this.movies.remove(movie);
            }
        }
    }

    public void returnMovie(Rental rental){
        if (rental.getCostumer().getRentals().contains(rental)){
            rental.getMovie().rentMovie(rental.getCostumer());
        }

    }

    public Customer getCostumerById(int id){

        for (Customer customer: customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }

        return null;
    }

    public Movie getMovieById(int id){

        for (Movie movie: movies){
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}
