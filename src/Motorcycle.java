public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Motorcycle engine has started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " Motorcycle engine has stopped.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}