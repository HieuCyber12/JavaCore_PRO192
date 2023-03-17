/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_se1748_ex1;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Atomic {
    private int number;
    private String symbol;
    private double weight;
    
    public Atomic(){}
    
    public Atomic(int number, String symbol, double weight){
        this.number = number;
        this.symbol = symbol;
        this.weight = weight;
    }
    
    public boolean accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter atomic number: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("Enter atomic symbol: ");
        symbol = sc.nextLine();
        System.out.print("Enter atomic weight: ");
        weight = Double.parseDouble(sc.nextLine());
        return true;
    }
    
    public void display(){
        System.out.format("%d - %s - %f\n", number,symbol,weight);      
    }
}
