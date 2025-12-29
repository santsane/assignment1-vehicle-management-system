public class Truck extends Vehicle {
    private double capacity; // Load capacity in tons
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Truck is rumbling to life... CHUG CHUG!");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " Truck parking brake engaged. Engine off.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Axles: " + numAxles);
    }
}