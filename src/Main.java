public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===\n");

        // Create Driver objects
        Driver driver1 = new Driver("Alihan", "D12345");
        Driver driver2 = new Driver("Tomiris", "M98765");

        // Create Vehicle objects using polymorphism
        Vehicle myCar = new Car("Toyota", 2022, 4, "Gasoline");
        Vehicle myBike = new Motorcycle("Harley", 2019, false);
        Vehicle myTruck = new Truck("Volvo", 2021, 15.5, 6);

        // Assign drivers to vehicles (Association)
        myCar.setDriver(driver1);
        myBike.setDriver(driver2);
        myTruck.setDriver(driver1); // John drives the truck too (Aggregation)

        // Store vehicles in an array
        Vehicle[] fleet = {myCar, myBike, myTruck};

        // Loop through the array and process each vehicle
        for (Vehicle v : fleet) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println(); // Empty line for readability
        }
    }
}