/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1_se1748;

/**
 *
 * @author HieuSA
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "NoName";        
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
}
