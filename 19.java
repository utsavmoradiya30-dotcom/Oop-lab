/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS5_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Result r = new Result(101, "Priyanka", 80, 75, 90);
        r.displayResult();
    }
    
}
