/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;
// Point class
class Point {
    private int x;
    private int y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}



/**
 *
 * @author nikunjjoshi
 */
public class PS2_9 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
         // Default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

        // Parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
        
     }
    
}
