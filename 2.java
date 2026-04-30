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

public class PS1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Calculate determinants
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        }

        sc.close();

    }
    
}
