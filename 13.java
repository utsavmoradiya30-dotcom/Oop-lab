/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

// Base class
class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class Triangle
class Triangle extends Shape {

    // Method to calculate area of triangle
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {

    // Method to calculate area of rectangle
    double calculateArea() {
        return d1 * d2;
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5); // base and height
        System.out.println("Area of Triangle: " + t.calculateArea());

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(4, 6); // length and width
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
    
}
