public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    public void startEngine() {
        System.out.println(brand + " Truck engine has started.");
    }

    public void stopEngine() {
        System.out.println(brand + " Truck engine has stopped.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck Capacity: " + capacity + " tons");
        System.out.println("Number of Axles: " + numAxles);
    }
}