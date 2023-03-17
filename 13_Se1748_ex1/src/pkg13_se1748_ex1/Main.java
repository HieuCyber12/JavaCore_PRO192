/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_se1748_ex1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList colourList = new ArrayList();
        
        colourList.add("white");
        colourList.add("blue");
        colourList.add("yellow");
        colourList.add("black");
        colourList.add("red");
        colourList.add("grey");
        
        System.out.println("Amount of elements in the colour list are: " + colourList.size());
        System.out.println("Each colour in the list are: ");
        for(Object obj:colourList){
            System.out.print(obj +", ");
        }
        colourList.add(2, "orange");
        colourList.add(0, "green");
        System.out.println("\nThe list after add new colour: ");
        for(Object obj:colourList){
            System.out.print(obj +", ");
        }
        
        colourList.remove(colourList.size()-1);
        System.out.println("\nList after remove the last element: ");
        for(Object obj:colourList){
            System.out.print(obj +", ");
        }
        
        System.out.println("\nThe list after sorted: ");
        colourList.add("grey");
        Collections.sort(colourList);
        for(Object obj:colourList){
            System.out.print(obj +", ");
        }
        

        System.out.println("\nSublist after get: ");
        ArrayList<String> colourSubList = new ArrayList(colourList.subList(1, 5));
        Collections.reverse(colourSubList);
         for(Object obj:colourSubList){
            System.out.print(obj +", ");
        }

    }
    
}
