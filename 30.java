/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.util.*;

/**
 *
 * @author nikunjjoshi
 */
public class PS9_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Convert to lowercase (optional, for uniform counting)
        input = input.toLowerCase();

        // Split sentence into words
        String[] words = input.split("\\s+");

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
    
}
