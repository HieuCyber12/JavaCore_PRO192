/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_se1748_ex1;
import java.io.Serializable;
/**
 *
 * @author HieuSA
 */
public class Employee implements Serializable {
    String code;
    String name;
    int salary;

    public Employee() {
        code=name="";
    }
    
    

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "code=" + code + ", name=" + name + ", salary=" + salary + '}';
    }
    
    
}
