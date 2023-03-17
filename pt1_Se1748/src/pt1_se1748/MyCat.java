/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1_se1748;

/**
 *
 * @author HieuSA
 */
public class MyCat implements ICat {
    
    @Override
    public int countBxxA(Cat[] c) {
       int count = 0;
       for(Cat cat: c){
           if(cat.getName().startsWith("B") && cat.getName().endsWith("A")){
               count++;
           }
       }
       return count;
    }

    @Override
    public void reverse5(Cat[] c) {
      for(int i = 0; i < 5/2; i++){
          Cat temp = c[i];
          c[i] = c[4-i];
          c[4-i] = temp;
      }
    }

    @Override
    public void move2nd(Cat[] c) {
        if (c[2].getAge() > 5) {
                Cat temp = c[2];
                c[2] = c[c.length - 1];
                c[c.length - 1] = temp;
            }
        
       for (int i = 1; i < c.length - 1; i++) {      
            if(i >= 2){
                Cat temp = c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
            if(i==c.length-3){
                break;
                }
            }
        }  
    }
}
