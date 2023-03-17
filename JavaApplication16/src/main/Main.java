/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        
        
        int b = 5;
        double c = 10;
        int a [] = {1,2,3,8,5,6};
        System.out.println("Sum = " + (b+c));
        for(int traversal : a) System.out.print(traversal + " ");
        String nameStudent = "Hieu";
        String arrStr [] = {"a","b","c"};
        for(int i = 0; i < arrStr.length;i++){System.out.println(arrStr[i]);}
        System.out.println(name);
        System.out.println(age);
        
        
    }
    
}
