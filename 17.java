/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

// Interface 1
interface Exam {
    boolean isPassed(int mark);
}

// Interface 2
interface Classify {
    String getDivision(double average);
}

// Result class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of Exam
    public boolean isPassed(int mark) {
        return mark >= 40; // pass if 40 or more
    }

    // Implementation of Classify
    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else if (average >= 40)
            return "Third Division";
        else
            return "Fail";
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS5_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Result r = new Result();

        int mark = 55;
        double avg = 62.5;

        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(avg));
    }
    
}
