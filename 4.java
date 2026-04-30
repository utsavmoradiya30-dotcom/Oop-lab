/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

/**
 *
 * @author nikunjjoshi
 */
import java.util.Scanner;
public class PS1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        // Convert to metric units
        double weightKg = pounds * 0.45359237;
        double heightMeters = inches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        sc.close();
    }
    
}
