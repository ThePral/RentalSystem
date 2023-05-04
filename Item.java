import java.util.Date;

public class Item {

    static String title;
    static String genre;
    static Date releaseDate;
    static int id;
    static int rentalFee;
    static boolean available;

    public Item(String title, String genre, Date releaseDate, int id, int rentalFee, boolean available) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
        this.rentalFee = rentalFee;
        this.available = true;
    }

    public static String getTitle() {
        return title;
    }

    public static String getGenre() {
        return genre;
    }

    public static Date getReleaseDate() {
        return releaseDate;
    }

    public static int getId() {
        return id;
    }

    public static int getRentalFee() {
        return rentalFee;
    }

    public static boolean isAvailable() {
        return available;
    }

    public static void setAvailable(boolean available) {
        Item.available = available;
    }
}
