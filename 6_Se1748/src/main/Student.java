/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author HieuSA
 */
public class Student {
    private String name;
    private int age;
    private String id;
    
    public Student(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void sayHello(){
        System.out.println("Hello");
    }
}
