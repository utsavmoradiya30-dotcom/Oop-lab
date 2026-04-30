/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

// Shared class with synchronized method
class TablePrinter {

    // synchronized method
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500); // small delay to simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println(); // space after each table
    }
}

// Thread 1
class ThreadOne extends Thread {
    TablePrinter obj;

    ThreadOne(TablePrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(5); // Table of 5
    }
}

// Thread 2
class ThreadTwo extends Thread {
    TablePrinter obj;

    ThreadTwo(TablePrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(7); // Table of 7
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS7_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TablePrinter printer = new TablePrinter();

        ThreadOne t1 = new ThreadOne(printer);
        ThreadTwo t2 = new ThreadTwo(printer);

        t1.start();
        t2.start();
    }
    
}
