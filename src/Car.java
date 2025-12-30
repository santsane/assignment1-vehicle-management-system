public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year); // Calls the Vehicle constructor
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public void startEngine() {
        System.out.println(brand + " Car engine has started");
    }

    public void stopEngine() {
        System.out.println(brand + " Car engine has stopped.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Doors: " + doors);
        System.out.println("Fuel: " + fuelType);
    }
}