/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarun_240760107186;

import java.io.*;

/**
 *
 * @author nikunjjoshi
 */
public class PS8_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("students.txt");
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing to file
            fw = new FileWriter(file);
            fw.write("101, Priya, 85\n");
            fw.write("102, Rahul, 90\n");
            fw.write("103, Ankit, 78\n");

            System.out.println("Student records written to file successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println("Error closing FileWriter.");
            }
        }

        try {
            // Reading from file
            br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("Reading student records:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
    
}
