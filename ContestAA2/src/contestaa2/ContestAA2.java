/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contestaa2;
import java.util.*;
/**
 *
 * @author HieuSA
 */ 
import java.util.*;
public class ContestAA2 {
    
   


 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int lcm = (x*y)/gcd(x,y);
        int count1 = n/x - n/lcm;
        int count2 = n/y - n/lcm;
        int result = count1 + count2;
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}





    /**
     * @param args the command line arguments
     */


 

    

