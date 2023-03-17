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
        String s1 = "Hello";
        String s2 = new String("Hello");
        String str = "xin chao", name = "A.Thanh";
        str = str + " " + name;
        
        System.out.println("str");
        if(s1.equals(s2) ){
            System.out.println(s1 + "=" +s2);
        }
        
        System.out.println("Check:" + str.contains("chao"));
        str ="Xin chao tat ca cac ban";
        String s[] = str.split(" ");
        for(String x: s){
            System.out.println(x);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = Integer.parseInt(sc.nextLine() );
        System.out.println("Enter a string: ");
        String st = sc.nextLine() ;
        System.out.format("(The number is %d and the string is %s",a,st);
    }

}
