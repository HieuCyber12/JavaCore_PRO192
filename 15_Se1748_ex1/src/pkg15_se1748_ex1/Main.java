/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hello",s2="Hello";
        System.out.println("s1==s2?"+ (s1==s2));
        System.out.println("s1.equals(s2)"+ (s1.equals(s2)));
        
        String s3 = new String("Hello"), s4 = new String("Hello");
        
        System.out.println("s2==s3?"+ (s2==s3));
        System.out.println("s2.equals(s3)"+ (s2.equals(s3)));
        
        System.out.println("s3==s4?"+ (s3==s4));
        System.out.println("s3.equals(s4)"+ (s3.equals(s4)));
        
        System.out.println("s3.compareTo(s4)"+(s3.compareTo(s4)));
        
        String str = "How are you one two you good";
        String st = "me too three four five";
        
        System.out.println("index: you? " + str.indexOf("you"));
        System.out.printf("|%s|\n",str.substring(4,7));
        System.out.println("replace me: "+str.replaceAll("you", "me"));
        str = str.concat(st);
        
        String s[] = str.split("[\\s|.|?|,]+");
        for(String x:s) System.out.printf("|%s|, ",x);
        System.out.println("");
        
        for(int i = st.length()-1; i >=0;i--){
            System.out.printf(st.charAt(i)+" ");
        }
    }
    
}
