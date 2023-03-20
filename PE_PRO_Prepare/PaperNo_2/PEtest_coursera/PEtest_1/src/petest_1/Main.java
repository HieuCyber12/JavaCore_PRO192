/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petest_1;

import java.util.*;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SpecCala spc = new SpecCala("joHN wICk 109 PARis",10,7);
//        spc.setData();
//        System.out.println(spc.getValue());
        MyCala mc = new MyCala();
        ArrayList<Cala> calaList = new ArrayList<>();
        //sample 1:
//        calaList.add(new Cala("A",5));
//        calaList.add(new Cala("C",4));
//        calaList.add(new Cala("B",3));
//        calaList.add(new Cala("D",4));
//        calaList.add(new Cala("E",5));
//        calaList.add(new Cala("F",2));
        //sample 2:
        calaList.add(new Cala("A",4));
        calaList.add(new Cala("C",3));
        calaList.add(new Cala("B",7));
        calaList.add(new Cala("D",3));
        calaList.add(new Cala("E",7));
        calaList.add(new Cala("F",5));
        
//        System.out.println(mc.f1(calaList));
//          mc.f2(calaList);
          mc.f3(calaList);
    }
    
    
}
