/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1_se1748;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Cat extends Animal {
    private String type;

    public Cat() {
    }

    public Cat(String name, int age,String type) {
        super(name, age);
        this.type = type;
    }

   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "("+this.getName()+"/"+this.getAge()+"/"+this.getType()+")";
    }

    
    
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please input a CAT: ");
        System.out.printf("\nEnter name: ");
        this.setName(sc.nextLine());
        System.out.printf("\nEnter age: ");
        this.setAge(Integer.parseInt(sc.nextLine()));
        System.out.printf("\nEnter type: ");
        this.setType(sc.nextLine());       
    }
    
    public void display(){
        System.out.printf("[%s - %d - %s]\n",this.getName(),this.getAge(),this.getType());
    }
}
