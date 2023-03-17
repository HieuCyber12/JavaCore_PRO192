/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author HieuSA
 */
public class Entry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e = new Employee("Huyen",2000);
        Manager m = new Manager("Huu",5000,2000);
        e.display();
        m.display();
    }
    
}
