/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

/**
 *
 * @author nikunjjoshi
 */
public class PS6_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator.");
            }

            // Convert command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e);
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    

    }
    
}
