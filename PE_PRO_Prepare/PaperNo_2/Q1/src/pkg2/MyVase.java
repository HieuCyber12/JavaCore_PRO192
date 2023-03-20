/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.util.List;

/**
 *
 * @author HieuSA
 */
public class MyVase implements IVase {

    
    @Override
    public int f1(List<Vase> t) {
        int count = 0;
        for(int i = 0; i < t.size();i++){
            int length = t.get(i).getMaker().length();
            if(t.get(i).getMaker().charAt(0)=='B' && t.get(i).getMaker().charAt(length-1)=='A' ){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Vase> t) {
        for(int i = 0; i < 2;i++){
            Vase temp = t.get(i);
            t.set(i, t.get(4-i));
            t.set(4-i, temp);
        }
        for(Vase vase: t){
            System.out.print(vase+" ");
        }
                
    }

    @Override
    public void f3(List<Vase> t) {
        int count = 0;
        for(int i = 0; i < t.size();i++){
            if(t.get(i).getType() > 5){
                count++;
            }
            if(count == 2){
                t.remove(i);
                break;
            }
        }
        for(Vase vase: t){
            System.out.print(vase+" ");
        }
    }
    
}
