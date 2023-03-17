/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_se1748;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Hieu",23);
        p.display();
       Student s = new Student("",30,10);
       s.display();
       Student st = new Student();
       st.display();
    }
    
}
