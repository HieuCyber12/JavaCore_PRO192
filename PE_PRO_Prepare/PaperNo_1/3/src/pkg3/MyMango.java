/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.*;

/**
 *
 * @author HieuSA
 */
public class MyMango implements IMango {

    @Override
    public int f1(List<Mango> t) {
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getPrice() < 7){
                count++;
            }
        }
        return count;
    }

    @Override
    public int f2(List<Mango> t) {
//        Collections.sort(t, new Comparator<Mango>(){
//        @Override
//           public int compare(Mango c1, Mango c2) {
//              if(c1.getPrice() < c2.getPrice()){
//                  return c2.getPrice() -c1.getPrice();
//              }
//            return 0;
//           }
//    });
//        return 0;
    List<Mango> sortedMangoes = new ArrayList<>(t);
    Collections.sort(sortedMangoes, new Comparator<Mango>() {
        @Override
        public int compare(Mango c1, Mango c2) {
            return Integer.compare(c2.getPrice(), c1.getPrice());
        }
    });

    for (int i = 0; i < 4; i++) {
        t.add(i, sortedMangoes.get(i));
    }
    
        return 0;
    }

    @Override
    public int f3(List<Mango> t) {
        int maxPrice = t.get(0).getPrice();
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getPrice() > maxPrice){
                maxPrice = t.get(i).getPrice();
                count++;
            }
            if(count == 2){
                t.remove(i);
            }
        }
        return 0;
    }        
       
    
}
