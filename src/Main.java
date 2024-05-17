import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Singers singer1 = new Singers();
        // Here is desplay default values
        System.out.println("Default values of singer1:");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());

        // Here is Set values using setters
        singer1.setId(1);
        singer1.setName("Samim Ghazanavi");
        singer1.setAddress("140 King St, Toronto, Canada");
        singer1.setDateOfBirth(new Date(1999, 6, 24));
        singer1.setNumberOfAlbumsPublished(3);

        // Display updated values
        System.out.println("\nUpdated values of singer1:");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());
    }
}