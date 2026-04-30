/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

class BankAccount {
    String accNo, name;
    double balance;

    void openAccount(String a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.06, years);
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS4_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SavingAccount s = new SavingAccount();
        s.openAccount("101", "Priyanka", 10000);
        System.out.println("Interest: " + s.calculateInterest());

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount("102", "Priyanka", 20000);
        System.out.println("Maturity: " + f.maturityAmount(2));
    }
    
}
