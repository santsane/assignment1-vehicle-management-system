// Abstract class for the vehicles
public abstract class Vehicle {
    // Fields for brand and year
    protected String brand;
    protected int year;

    protected Driver driver;

    // Constructor to set up brand and year
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract methods for subclasses
    public abstract void startEngine();
    public abstract void stopEngine();

    // Setter for assigning driver to the vehicle
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info");
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);

        // Checking if there is a driver before printing driver info
        if (driver != null) {
            driver.print();
        } else {
            System.out.println("Driver: No driver assigned");
        }
    }
}