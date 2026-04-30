/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.io.*;

/**
 *
 * @author nikunjjoshi
 */
public class PS8_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (!Character.isWhitespace(line.charAt(i))) {
                        charCount++;
                    }
                }
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newline): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
    
}
