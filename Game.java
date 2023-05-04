import java.util.Date;

public class Game extends Item {

    private String platform;
    private String publisher;

    public Game(String title, String genre, Date releaseDate, int id, int rentalFee, boolean available,
                String platform, String publisher) {

        super(title, genre, releaseDate, id, rentalFee, available);

        this.platform = platform;
        this.publisher = publisher;

    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rentGame(){

    }

    public void returnGame(){

    }

}
