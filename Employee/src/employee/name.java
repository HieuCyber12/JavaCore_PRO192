/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author HieuSA
 */
class name {
    public static void main(String[] args) {
        Employee e = new Employee("Hieu",22,"hieuSA@gmail.com","developer",2000);

        e.getName();
        e.getAge();
        e.getGmail();
        e.getPosition();
        e.getSalary();
        System.out.println(e.getName());
    }
}
