import java.util.Date;

public class Singers {
    // Here is all Instance variables
    private int id;
    private String name;
    private String address;
    private Date dateOfBirth;
    private int numberOfAlbumsPublished;

    // Here is Constructors
    public Singers() {
        // These are default constructor
    }

    public Singers(int id) {
        this.id = id;
    }

    public Singers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Singers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Singers(int id, String name, String address, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Singers(int id, String name, String address, Date dateOfBirth, int numberOfAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Setters and getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }

}