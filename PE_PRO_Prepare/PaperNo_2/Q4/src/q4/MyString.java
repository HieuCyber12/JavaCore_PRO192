/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author HieuSA
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
         String  words[] = str.trim().split(" ");
         int count = 0;
         for(int i = 0; i  < words.length;i++){
             if(words[i].matches(".*\\d{1}$")){
                 count++;
             }
         }
         return count;
    }

    @Override
    public String f2(String str) {
        String  words[] = str.trim().split(" ");
        
        int minLength = words[0].length();
        for(int i = 0; i < words.length;i++){
            if(words[i].length() < minLength){
                minLength = words[i].length();            
            }
        }
        for(int i = 0; i < words.length;i++){
            if(words[i].length() == minLength){
                 words[i] = String.valueOf(minLength);  
                 break;
            }
        }
        return String.join(" ", words).trim();
    }
    
}
