/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle(5,10);
        System.out.println("Area: "+r.calArea());
        System.out.println("Perimeter: " + r.calPerimeter());
        Shape s = new Rectangle(20,9,"BLUE");
        s.display();
    }
    
    
}
