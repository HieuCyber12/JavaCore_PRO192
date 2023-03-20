/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petest_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author HieuSA
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getPrice() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int minPrice = t.get(0).getPrice();
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getPrice() < minPrice){
                minPrice = t.get(i).getPrice();
            }
        }
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getPrice() == minPrice){
                count++;
            }
            if(count == 2){
                t.remove(i);
                break;
            }
        }
        for(Cala cala: t){
            System.out.println(cala);
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t,new Comparator<Cala>() {
            @Override
            public int compare(Cala c1, Cala c2) {
                return c2.getOwner().compareTo(c1.getOwner());
                   
               
                    
            }
        });
        for(Cala cala: t){
            System.out.println(cala);
        }
    }
   
}
