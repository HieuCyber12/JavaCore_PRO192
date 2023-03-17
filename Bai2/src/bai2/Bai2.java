package bai2;

import java.util.Scanner;
import java.util.ArrayList;


public class Bai2 {

    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        int n = sc.nextInt();
        

      for (int i = 1; i < n; i++)
      {
          String input = sc.nextLine();
          list.add(input);
      }
            
       for ( String input: ArrayList) {
           if( input.equals(input.toUpperCase()) && input.equals(input.length() >3))
                System.out.println(list);
            else
       }
        
            
                   
        
    }
    
}
