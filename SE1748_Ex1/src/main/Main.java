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
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter operator: ");
        String operand = sc.nextLine();
        
        switch(operand){
            case "+":   {
                System.out.println(a + " + " + b + " = " + (a+b));
                //Or we can using format
                System.out.format("%d %s %d = %d",a,operand,b, a + b);
                break;
            }
            case "-":   {
                System.out.println(a + " - " + b + " = " + (a-b));
//                System.out.format("%d %s %d = %d",a,operand,b, a - b);
                break;
            }
            case "*":   {
                System.out.println(a + "*" + b + "= " + (a*b));
//                System.out.format("%d %s %d = %d",a,operand,b, a * b);
                break;
            }
            case "/":   {
                System.out.println(a + "/" + b + "= " + (a/b));
//                System.out.format("%d %s %d = %d",a,operand,b, a / b);
                break;
            }
            
        }
     
    }
    
}
