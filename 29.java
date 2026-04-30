/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nikunjjoshi
 */
public class PS9_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create ArrayList to store marks
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(85);
        marks.add(92);
        marks.add(76);
        marks.add(88);
        marks.add(69);

        // Display all marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Find highest and lowest marks
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        // Display results
        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
    
}
