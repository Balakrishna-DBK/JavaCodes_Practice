package GeneralCodePract;

// Superclass
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass
class Car extends Vehicle {
    Car() {
        super("Car"); // Calls parameterized constructor of Vehicle
        System.out.println("Car constructor called");
    }

    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

// Main class with main method
public class ConstructorSup {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
