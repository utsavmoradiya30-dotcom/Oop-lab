/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;
import java.util.Scanner;


/**
 *
 * @author nikunjjoshi
 */
public class PS10_34 {
    
    
    
    
        

        


    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Check triangle validity
        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Output
            System.out.printf("Area of the triangle: %.2f\n", area);

        } else {
            System.out.println("Invalid triangle! The given sides do not form a triangle.");
        }

        sc.close();
        
        
    }
    
}
