/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.util.Scanner;

// Outer class
class College {
    String collegeName;

    // Constructor
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Inner class
    class Admission {
        String studentName;
        String course;

        // Accept details
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        // Display details
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}
/**
 *
 * @author nikunjjoshi
 */
public class PS3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create outer class object
        College c = new College("ABC Engineering College");

        // Create inner class object
        College.Admission a = c.new Admission();

        // Call methods
        a.acceptDetails();
        a.displayDetails();

    }
    
}
