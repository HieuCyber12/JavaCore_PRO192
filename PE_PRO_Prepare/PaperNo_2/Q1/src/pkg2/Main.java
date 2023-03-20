/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.util.*;
/**
 *
 * @author HieuSA
 */
public class Main {

   
    public static void main(String[] args) {
        MyVase mv = new MyVase();
         ArrayList<Vase> vaseList = new ArrayList<>();
        vaseList.add(new Vase("B1A",9));
        vaseList.add(new Vase("B2A",1));
        vaseList.add(new Vase("A1B",8));
        vaseList.add(new Vase("A",2));
        vaseList.add(new Vase("A2B",7));
        vaseList.add(new Vase("B3A",6));
        vaseList.add(new Vase("B",5));
        
        System.out.println(mv.f1(vaseList));
//        mv.f2(vaseList);
        System.out.println("");
        mv.f3(vaseList);
    }
    
}
