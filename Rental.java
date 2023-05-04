import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {

    private int id;
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Rental(int id, Movie movie, Customer costumer, Date rentalDate, Date returnDate) {
        this.id = id;
        this.movie = movie;
        this.customer = customer;
        this.rentalDate = new Date();
        this.returnDate = new Date(rentalDate.getTime()+ TimeUnit.DAYS.convert(Duration.ofDays(7)));
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCostumer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
