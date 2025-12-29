public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    // Constructor passing brand and year to the superclass
    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year); // Calls Vehicle(brand, year)
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Car is starting... Vroom vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " Car engine stopped.");
    }

    // Overriding displayInfo to include specific Car details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent method first
        System.out.println("Type: Car");
        System.out.println("Doors: " + doors);
        System.out.println("Fuel: " + fuelType);
    }
}