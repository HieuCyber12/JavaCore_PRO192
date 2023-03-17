/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont = false;
        do{
            try{
                int num;
                Scanner sc = new Scanner(System.in);
                num = Integer.parseInt(sc.nextLine());
                if(num<1)
                    throw new Exception();
                System.out.println("The number is " + num);
                cont = false;
            }
            catch(Exception e){
                System.out.println("The number is invalid");
                cont = true;
            }
        }
        while(cont);
    }
    
}
