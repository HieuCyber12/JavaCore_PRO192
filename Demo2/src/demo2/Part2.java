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
public class Part2 {

    /**
     *
     * @return
     * @throws java.lang.Exception
     */
    public static int enterEdge1() throws Exception {
        boolean cont = false;
        do{
            try{
            int edge;
                System.out.print("Enter 1st edge of triangle: ");
            Scanner sc = new Scanner(System.in);
            edge = Integer.parseInt(sc.nextLine());
         
            if(edge<0){     
                throw new Exception(" edge > 0");    
            }
            if(edge > 0)
                return edge;
        }
        catch(NumberFormatException e){
          System.out.println("- ERROR:  edge must be a number ");
          cont = true;
        }
            
        catch(Exception e){      
            System.out.println("- ERROR: " + e.getMessage());
            cont = true;
        }
           
        }
        while(cont);
        return 1;
    }
    public static int enterEdge2() throws Exception {
        boolean cont = false;
        do{
            try{
            int edge;
                System.out.print("Enter 2st edge of triangle: ");
            Scanner sc = new Scanner(System.in);
            edge = Integer.parseInt(sc.nextLine());
         
            if(edge<0){     
                throw new Exception(" edge > 0");    
            }
            if(edge > 0)
                return edge;
        }
        catch(NumberFormatException e){
          System.out.println("- ERROR:  edge must be a number ");
          cont = true;
        }
            
        catch(Exception e){      
            System.out.println("- ERROR: " + e.getMessage());
            cont = true;
        }
           
        }
        while(cont);
        return 1;
    }
    public static int enterEdge3() throws Exception {
        boolean cont = false;
        do{
            try{
            int edge;
                System.out.print("Enter 3st edge of triangle: ");
            Scanner sc = new Scanner(System.in);
            edge = Integer.parseInt(sc.nextLine());
         
            if(edge<0){     
                throw new Exception(" edge > 0");    
            }
            if(edge > 0)
                return edge;
        }
        catch(NumberFormatException e){
          System.out.println("- ERROR:  edge must be a number ");
          cont = true;
        }
            
        catch(Exception e){      
            System.out.println("- ERROR: " + e.getMessage());
            cont = true;
        }
           
        }
        while(cont);
        return 1;
    }
    //* ERROR: 3 edges are not legal (a+b≤c or b+c≤a or a+c≤b)
    public static void main(String[] args) throws Exception {
       boolean cont = false;
       int a,b,c;
       do{
         try{
            a = enterEdge1();
            b = enterEdge2();
            c = enterEdge3();
            if((a + b) <= c || (b+c) <= a || (a+c) <= b ){
                throw new Exception("3 edges are not legal (a+b≤c or b+c≤a or a+c≤b)");
            }
            else
            {
                int p = a + b +c;
                int halfP = p/2;
                System.out.format("A valid triangle(%d,%d,%d)\n", a,b,c);
                System.out.println("+ Area: " + Math.sqrt(halfP*(halfP-a)*(halfP-b)*(halfP-c)));
                System.out.format("+ Perimeter: %d\n", p);
                break;
            }
         }
        
         catch(Exception e){
             System.out.println("- ERROR: " + e.getMessage());
             cont = true;
         }
        
       }
       while(cont);
       



       
    }
}
