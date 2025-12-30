public class Main {
    public static void main(String[] args) {
        // Creating the drivers
        Driver d1 = new Driver("Alihan", "D12345");
        Driver d2 = new Driver("Tomiris", "M98765");

        // Creating the vehicles with polymorphism
        Vehicle v1 = new Car("Toyota", 2022, 4, "Gasoline");
        Vehicle v2 = new Motorcycle("Harley", 2019, false);
        Vehicle v3 = new Truck("Volvo", 2021, 15.5, 6);

        // Assigning drivers to the vehicles with association
        v1.setDriver(d1);
        v2.setDriver(d2);
        v3.setDriver(d1);

        // Array of vehicles
        Vehicle[] myFleet = {v1, v2, v3};

        // Looping through the array
        for (int i = 0; i < myFleet.length; i++) {
            myFleet[i].startEngine();
            myFleet[i].displayInfo();
            myFleet[i].stopEngine();
        }
    }
}