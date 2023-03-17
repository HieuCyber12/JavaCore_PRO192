/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_se1748_ex1;

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
       ItemList list = new ItemList();
       
       Scanner sc = new Scanner(System.in);
        list.addItem(new Vase(30, "Mr.X", 50, "Wood")); 
        list.addItem(new Statue(230, "Mr.Bean", 80, "Blue"));
        list.addItem(new Vase(100, "David", 120, "Soil"));
        list.displayAll();
        System.out.println("Input the number Item you want to add: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            list.addItem();
        }
        

        System.out.println("Search by Creator:");
        System.out.println(list.searchByCreator("Mr.Bean")+"\n");
        
        System.out.println("After sort by Creator: ");
        list.sortByCreator();
        list.displayAll();
        
        System.out.println("After sort by Value: ");
        list.sortByValue();
        list.displayAll();
        
        System.out.println("After remove element at index 1: ");
        list.remove(1);
        list.displayAll();
        
        System.out.println("After partition: ");
        list.partition2Types();
        list.displayAll();
        
        System.out.println("Add Correct: ");
        list.addCorrectPart();
        list.displayAll();
        
        list.displayTop3();
    }
}
