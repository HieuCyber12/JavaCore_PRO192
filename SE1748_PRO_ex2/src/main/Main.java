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
        inputAge();
        inputStudentID();
    }
    
    public static int inputAge(){
        boolean check = true;
        do{
            
            try{
             Scanner sc= new Scanner(System.in);
            System.out.println("Enter integer a in [0,150] : ");
            int a = sc.nextInt();
            sc.nextLine();
            if(a < 0 || a > 150) {
                throw new Exception("Must in [0,150]");
            }
            check = false;
          }
            catch(Exception e){
                System.out.println("Invalid values! Try again");
            }
        }
        while(check);
        return 0;     
    }
    
    public static String inputStudentID(){
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your student ID: ");
                String id = sc.nextLine();
                String pattern = "^([A-Z]{2})([0-9]{6})$";  
                if(id.matches(pattern) ){
                    throw new Exception("Wrong");
                }
                break;
//               if(id.length() != 8){
//                   throw new Exception("Your id must have 8 characters");
//               }
                            
        }
        catch(Exception e){
            System.out.println("Your ID is invalid! Please try again");
        }
        }
        while(true);
        return null;
              
    }
    
}
