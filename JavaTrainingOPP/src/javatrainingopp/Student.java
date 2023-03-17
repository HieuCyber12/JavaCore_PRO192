/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatrainingopp;

import java.util.Scanner;



/**
 *
 * @author HieuSA
 */
public class Student {
    private String name;
    private int age;
    
    
    Scanner sc = new Scanner(System.in);
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        while(age < 0 || age > 100)
        {
            System.out.println("Re_input your age: ");
            age = sc.nextInt();
        }
        
    }
    public String getName( ) {
        return name;
    }
    public int getAge(int age){     
        return age;        
    }
}
