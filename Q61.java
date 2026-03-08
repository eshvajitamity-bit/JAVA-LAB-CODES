//Q61. Design an interface Vehicle with a default method start() and an abstract method fuelType(). Implement this interface in two classes : Car and Bike

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    String fuelType();
}

class Car implements Vehicle {
    @Override
    public String fuelType() {
        return "Petrol";
    }
}

class Bike implements Vehicle {
    @Override
    public String fuelType() {
        return "Diesel";
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start(); // Output: Vehicle is starting...
        System.out.println("Car fuel type: " + car.fuelType()); // Output: Car fuel type: Petrol

        bike.start(); // Output: Vehicle is starting...
        System.out.println("Bike fuel type: " + bike.fuelType()); // Output: Bike fuel type: Diesel
    }
}
