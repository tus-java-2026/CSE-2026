package Com.ait.wk5;

public class Phone {

    // Instance variables (attributes)
    private String phoneNumber;
    private String ownersName;
    private double price;

    // Default constructor
    public Phone() {
        phoneNumber = "0000";
        ownersName = " ";
        price = 00.00;
    }

    // Constructor with parameters
    public Phone(String phoneNumber, String ownersName, double price) {
        this.phoneNumber = phoneNumber;
        this.ownersName = ownersName;
        this.price = price;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter for owner's name
    public String getOwnersName() {
        return ownersName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Setter for owner's name
    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}