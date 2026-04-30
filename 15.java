/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

class Employee {
    String name = "Priyanka";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 5;
    String project = "AI Project";

    // Overriding method
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

/**
 *
 * @author nikunjjoshi
 */
public class PS4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();  // calls Employee method
        System.out.println("------");
        m.displayDetails();  // calls Manager method
    }
    
}
