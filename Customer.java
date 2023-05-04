import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

}
