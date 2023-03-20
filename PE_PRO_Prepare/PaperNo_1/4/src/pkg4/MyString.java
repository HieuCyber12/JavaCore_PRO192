/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author HieuSA
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String[] words = str.split("\\s+");
    
    int count = 0;
    for (String word : words) {

        if (word.matches("^[02468].*")) {
            count++;
        }
    }
    return count;
    }

    @Override
    public String f2(String str) {
        String words[] = str.trim().split(" ");
        int n = words.length;
        int count = 00;
        for(int i = 0; i < n; i++){
            String word = words[i];
            if(isPlatindrome(word)){            
                count++;
            }
            if(count == 1){
                words[i] = "";
                break;
            }
        }
        
        for(String word:words){
            System.out.println(word);
        }
        return String.join(" ", words).replaceAll("\\s+", " ").trim();
    }
    
    private static boolean isPlatindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
