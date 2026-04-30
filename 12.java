/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

class VolumeCalculator {

    // Method to calculate volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method to calculate volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate volume of Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}


/**
 *
 * @author nikunjjoshi
 */
public class PS3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VolumeCalculator obj = new VolumeCalculator();

        // Cube
        double cubeVolume = obj.calculateVolume(3);
        System.out.println("Volume of Cube: " + cubeVolume);

        // Rectangular Cube
        double rectVolume = obj.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);

        // Sphere
        double sphereVolume = obj.calculateVolume(2.5f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
    
}
