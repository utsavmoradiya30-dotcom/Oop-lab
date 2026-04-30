*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

/**
 *
 * @author nikunjjoshi
 */
import java.util.Scanner;
public class PS1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();

        // Convert meters to feet
        double feet = meters * 3.28084;

        // Display result formatted to 2 decimal places
        System.out.printf("Distance in feet: %.2f\n", feet);

        scanner.close();
    }
    
}
