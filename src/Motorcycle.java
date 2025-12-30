public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    public void startEngine() {
        System.out.println(brand + " Motorcycle engine has started.");
    }

    public void stopEngine() {
        System.out.println(brand + " Motorcycle engine has stopped");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");

        if (hasSidecar) {
            System.out.println("Has Sidecar: Yes");
        } else {
            System.out.println("Has Sidecar: No");
        }
    }
}