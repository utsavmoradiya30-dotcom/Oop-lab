/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {}

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

/**
 *
 * @author nikunjjoshi
 */
public class PS2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2:");
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
    
}
