/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

/**
 *
 * @author nikunjjoshi
 */
public class PS6_21 {
    
    // Method to check voting eligibility
    public static void checkEligibility(int age) {
        if (age < 18) {
            // Throw exception if age is less than 18
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Test with different age inputs
        int[] testAges = {16, 18, 21, 15};

        for (int age : testAges) {
            try {
                System.out.println("Checking age: " + age);
                checkEligibility(age);
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed\n");
            }
        }
    }
    
}
