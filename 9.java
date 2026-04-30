/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

class BankAccount {
    String name;
    double balance;
    static double interest_rate = 5; // shared

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println(name + " Interest: " + calculateInterest());
    }

    static void setInterestRate(double rate) {
        interest_rate = rate;
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccount b1 = new BankAccount("Tarun", 10000);
        BankAccount b2 = new BankAccount("Raj", 20000);

        b1.display();
        b2.display();

        // Update interest rate
        BankAccount.setInterestRate(7);

        System.out.println("\nAfter updating interest rate:");
        b1.display();
        b2.display();
    }
    
}
