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
    public String inputString() throws Exception{
        String pattern = "";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string:");
        s = sc.nextLine();
        if(!s.matches(pattern))
            throw new Exception();
        return s;
    } 
    public static void main(String[] args)  {
        // TODO code application logic here
        Main obj = new Main();
        boolean cont = false;
        do{
            try{
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            }
            catch(Exception e){
                System.out.println("The string is invalid!");
            }
        }
        while(cont);
    }
    
//    public int enterNumber() {
//    
//}
    
}
