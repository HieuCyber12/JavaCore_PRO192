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
     * If  you want to use printf syntax like C programming
     * you can using System.out.format === printf
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Q1
        if(n<= 0){
            System.out.println("Please input again!");
        }
        else
            System.out.println("The value of n is: " + n);
        
        //Q2
//        String arrStr[];
        String arrStr[] = {"hong","tra","cuc","lan","hue"};
        
        String name = sc.nextLine();
        for(int i = 0; i < arrStr.length;i++){
            if(arrStr[i].equals(name)){
                System.out.println(name);
            }
        }

    }
    
}
