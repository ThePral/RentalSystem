import java.util.Date;

public class Book extends Item {

    private String author;
    private String publisher;

    public Book(String title, String genre, Date releaseDate, int id, int rentalFee, boolean available,
                String author, String publisher) {

        super(title, genre, releaseDate, id, rentalFee, available);

        this.author = author;
        this.publisher = publisher;

    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rentBook(){

    }

    public void returnBook(){

    }
}
