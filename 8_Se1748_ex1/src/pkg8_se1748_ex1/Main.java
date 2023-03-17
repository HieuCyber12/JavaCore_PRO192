/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        Cylinder cylin = new Cylinder(12.5, 5.6);
        System.out.println("The circumference of Cylinder: " + cylin.getArea());
        System.out.println("The volume of Cylinder: " + cylin.getVolume());
    }
    
}
