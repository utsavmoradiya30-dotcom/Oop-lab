/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

// Abstract class
abstract class Vehicle {
    
    abstract String fuelType();
    abstract int noOfWheels();
}

// Car class
class Car extends Vehicle {
    
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

// Bike class
class Bike extends Vehicle {
    
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS5_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehicle c = new Car();
        Vehicle b = new Bike();

        System.out.println("Car Fuel: " + c.fuelType());
        System.out.println("Car Wheels: " + c.noOfWheels());

        System.out.println("------");

        System.out.println("Bike Fuel: " + b.fuelType());
        System.out.println("Bike Wheels: " + b.noOfWheels());
    }
    
}
