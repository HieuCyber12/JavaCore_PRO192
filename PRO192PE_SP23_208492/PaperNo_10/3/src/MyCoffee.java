
import java.util.List;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(!t.get(i).getName().contains("A")||!t.get(i).getName().contains("B")){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        int maxSize = t.get(0).getSize();
        for(int i = 0; i< t.size();i++){
            if(maxSize < t.get(i).getSize()){
                maxSize = t.get(i).getSize();
            }
        }
        for(int i = 0; i< t.size();i++){
            if(maxSize == t.get(i).getSize()){
                t.remove(i);
                break;
            }
        }
    }

    @Override
    public void f3(List<Coffee> t) {
        List<Coffee> items = t.subList(0, 3);
       Collections.sort(items, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee s1, Coffee s2) {
                int price1 = s1.getSize()%10;
                int price2 = s2.getSize()%10;
                return Integer.compare(price2, price1);
                
            }
        });
       for(Coffee cf:items){
           System.out.println(cf.toString());
       }
       for(int i = 0; i < 3;i++){
           t.set(i, items.get(i));
       }

    }
    
}
