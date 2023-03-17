/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.util.ArrayList;

/**
 *
 * @author HieuSA
 */
public class Employee {
    private String name;
   private int age;
   private String gmail;
   private String position;
   private double salary;

    public Employee(String name, int age, String gmail, String position, double salary) {
       this.name = name;
       this.age = age;
       this.gmail = gmail;
       this.position = position;
       this.salary = salary;
   }
    public Employee() {}
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
   
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getGmail() {
        return gmail;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        ArrayList<Employee> EmployeeList;
        EmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("Hieu",22,"hieuSA@gmail.tech","SA",5000);
        Employee employee2 = new Employee("Mai",18,"luaga.gmail.com","LA",2000);
        Employee employee3 = new Employee("Duc",21,"canboxa1@gmail.com","TL",4500);
        Employee employee4 = new Employee("Duca",22,"canboxa2@gmail.com","TL",3500);
        Employee employee5 = new Employee("Ducat",20,"canboxa3@gmail.com","TL",4000);
        
        EmployeeList.add(employee1);
        EmployeeList.add(employee2);
        EmployeeList.add(employee3);
        EmployeeList.add(employee4);
        EmployeeList.add(employee5);
        
        
        Employee max = EmployeeList.get(0);
        for(int i = 1; i < 5; i++ ) {
            if(max.salary < EmployeeList.get(i).salary) {
                max = EmployeeList.get(i);
            }
        }
        System.out.println(max.getSalary());
    }
}
