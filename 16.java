/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else
            return "No Division";
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS5_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Result r = new Result();

        double avg = 65;
        System.out.println("Division: " + r.getDivision(avg));
    }
    
}
