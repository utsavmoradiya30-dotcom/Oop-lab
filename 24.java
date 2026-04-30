/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.print(i + " ");
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.print(i + " ");
        }
    }
}

/**
 *
 * @author nikunjjoshi
 */
public class PS7_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            t1.start();
            t1.join();  // Wait until T1 finishes

            t2.start();
            t2.join();  // Wait until T2 finishes

            t3.start();
            t3.join();  // Wait until T3 finishes

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
    
}
