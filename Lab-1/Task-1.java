import java.util.ArrayList;

/* =======================
   ABSTRACT CLASS
   ======================= */
abstract class Vehicle {

    // Encapsulation: private data members
    private int vehicleId;
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(int vehicleId, String brand, int speed) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.speed = speed;
    }

    // Getters and Setters
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Abstract methods
    public abstract void start();
    public abstract void stop();
    public abstract String getFuelType();

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

/* =======================
   CAR CLASS
   ======================= */
class Car extends Vehicle {

    private int numberOfDoors;

    public Car(int vehicleId, String brand, int speed, int numberOfDoors) {
        super(vehicleId, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car is starting with a key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

/* =======================
   BIKE CLASS
   ======================= */
class Bike extends Vehicle {

    private boolean hasCarrier;

    public Bike(int vehicleId, String brand, int speed, boolean hasCarrier) {
        super(vehicleId, brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Bike is starting with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

/* =======================
   TRUCK CLASS
   ======================= */
class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int vehicleId, String brand, int speed, double loadCapacity) {
        super(vehicleId, brand, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting with heavy-duty ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

/* =======================
   MAIN CLASS
   ======================= */
public class Main {

    public static void main(String[] args) {

        // Polymorphism: Vehicle reference
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(101, "Toyota", 180, 4));
        vehicles.add(new Bike(102, "Yamaha", 120, true));
        vehicles.add(new Truck(103, "Volvo", 90, 15.5));

        // Demonstrating polymorphic behavior
        for (Vehicle v : vehicles) {
            System.out.println("\n---------------------------");
            v.start();
            System.out.println("Fuel Type: " + v.getFuelType());
            v.displayDetails();
            v.stop();
        }
    }
}
