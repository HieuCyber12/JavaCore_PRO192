
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch=='2' || ch == '5' || ch == '7'){
                count++;
            }
        }
        return count;
    }
    
    
    @Override
    public String f2(String str) {
        String [] words = str.split("[ ]+");
        String sReverse ="";

        for(int i = words.length - 1 ; i >= 0 ;i--) {
            sReverse= sReverse + words[i] + " ";
        }
        sReverse = sReverse.trim();
        return sReverse;
    }
    
}
