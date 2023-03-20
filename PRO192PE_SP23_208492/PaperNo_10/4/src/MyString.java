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
         String words[]=str.trim().split(" ");
        
         int count = 0;
         for(int i = 0; i <words.length;i++){       
             if(words[i].matches(".*[13579].*")){
                 count++;
             }
         }
         return count;
    }

    @Override
    public String f2(String str) {
        String words[]=str.trim().split(" ");
         int shortestLength = words[0].length();
         int longestLength = words[0].length();
         for(int i = 0; i < words.length;i++){
             if(shortestLength > words[i].length()){
                 shortestLength = words[i].length();
             }
             if(longestLength < words[i].length()){
                 longestLength = words[i].length();
             }
         }
         for(int i = 0; i < words.length;i++){
             if(shortestLength == words[i].length()){
                 words[i] =String.valueOf(longestLength);
                 break;
             }
         }
         return String.join(" ", words).trim();
    }
    
}
