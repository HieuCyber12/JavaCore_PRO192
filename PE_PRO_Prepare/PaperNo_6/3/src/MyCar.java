
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
public class MyCar implements  ICar {

    @Override
    public int f1(List<Car> t) {
        int sumRate = 0;
        double averRate = 0;
        int count = 0;
        for(int i = 0; i < t.size();i++){
            sumRate += t.get(i).getRate();     
            count ++;
        }
        averRate = sumRate/count;
        return (int) Math.floor(averRate);
    }

    @Override
    public void f2(List<Car> t) {
        int minRate = t.get(0).getRate();
        int maxRate = t.get(0).getRate();
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getRate()<minRate){
                minRate = t.get(i).getRate();
                minIndex = i;
            }
            if(t.get(i).getRate()>maxRate){
                maxRate = t.get(i).getRate();
                maxIndex = i;
            }
            
        }
        
       Collections.swap(t, minIndex, maxIndex);
        
    }

    @Override
    public void f3(List<Car> t) {
       Collections.sort(t, new Comparator<Car>() {
           @Override
           public int compare(Car c1, Car c2) {
               if(c1.getMaker().compareTo(c2.getMaker()) != 0 )
                return c1.getMaker().compareTo(c2.getMaker());
              else
                   return c2.getRate() - c1.getRate();
           }
           
       });     
    }
    
}
