/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_se1748_ex1;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vase v[] = new Vase[100];
        v[0] = new Vase(80,"Dicanio",50,"Soil");
        v[1] = new Vase(300,"Biden",200,"Wood");
        
        System.out.print("Enter the number of vases you want to input: \n");
        int m = Integer.parseInt(sc.nextLine());
        //Input
        for(int i = 2; i < m; i++){
            v[i] = new Vase();
            v[i].input();   
        }
        //Display
        for(int i = 0; i < m+2; i++){
            System.out.println(v[i]);  
        }
        
  
    }
}
