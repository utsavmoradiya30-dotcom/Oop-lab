/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.util.LinkedList;

/**
 *
 * @author nikunjjoshi
 */
public class PS9_32 {

    /**
     * @param args the command line arguments
     */
    
    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test with LinkedList<Integer> (roll numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Searching in Roll Numbers:");
        System.out.println("Is 102 present? " + searchElement(rollNumbers, 102));
        System.out.println("Is 105 present? " + searchElement(rollNumbers, 105));

        // Test with LinkedList<String> (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Priya");
        names.add("Rahul");
        names.add("Ankit");
        names.add("Sneha");

        System.out.println("\nSearching in Names:");
        System.out.println("Is 'Rahul' present? " + searchElement(names, "Rahul"));
        System.out.println("Is 'Amit' present? " + searchElement(names, "Amit"));
    }
    
}
