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
public class Student extends Person {
    
    private double grade;
    
    public Student(){}
    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }
 
    @Override
    public void display(){
        System.out.printf("Student name: %s. Age: %d. Grade: %f",this.getName(),this.getAge(),grade);
    }
    public int getAgeFinishFU(){
        return this.getAge() + 4;
    }
    
}
