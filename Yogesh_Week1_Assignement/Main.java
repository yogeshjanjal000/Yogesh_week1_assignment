class Vehicle {

    // Method to be overridden
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    // Method to display vehicle type (example of polymorphism)
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

// Derived class Car
class Car extends Vehicle {

    // Overriding the start method
    @Override
    public void start() {
        System.out.println("The car is starting with a key.");
    }

    // Overriding the displayType method
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }
}

// Derived class Bike
class Bike extends Vehicle {

    // Overriding the start method
    @Override
    public void start() {
        System.out.println("The bike is starting with a kick.");
    }

    // Overriding the displayType method
    @Override
    public void displayType() {
        System.out.println("This is a bike.");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {

        // Polymorphism: Vehicle reference to Car object
        Vehicle myCar = new Car();
        myCar.start();  // Calls the Car's start method
        myCar.displayType();  // Calls the Car's displayType method

        // Polymorphism: Vehicle reference to Bike object
        Vehicle myBike = new Bike();
        myBike.start();  // Calls the Bike's start method
        myBike.displayType();  // Calls the Bike's displayType method

        // Direct use of Vehicle class
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start();  // Calls the Vehicle's start method
        genericVehicle.displayType();  // Calls the Vehicle's displayType method
    }
}

