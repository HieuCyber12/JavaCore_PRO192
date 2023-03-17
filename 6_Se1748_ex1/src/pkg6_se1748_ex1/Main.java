/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_se1748_ex1;

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
        Atomic a = new Atomic(20,"Ca", 40.078);
        a.display();
        
        Atomic b = new Atomic();
        b.accept();
        b.display();
        
        Rectangle r = new Rectangle(10.5,20.5);
        r.display();
        
        Rectangle r1 = new Rectangle();
        r1.input();
        r1.display();
    }
    
}
