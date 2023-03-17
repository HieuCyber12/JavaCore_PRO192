/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contestaa_personal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class ContestAA_personal {

    /**
     * @param scores
     * @return 
     */ public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
            List<Integer> count = new ArrayList<>();
           

            int countMost = 0;
            int countLess = 0;
            

            int max = scores.get(0);
            int min = scores.get(0);
            for(int i = 1; i < scores.size();i++){
                if(max < scores.get(i) ){
                    max = scores.get(i);
                    countMost += 1;
                }
                else if(min  > scores.get(i)){
                    min = scores.get(i);
                    countLess += 1;
                }
            }
            count.add(countMost);
            count.add(countLess);

            return count;
    }
     static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z-y)<Math.abs(z-x)){
            return "Cat B";
        } 
        else if(Math.abs(z-y)>Math.abs(z-x)){
            return "Cat A";
        }
        else{
            return "Mouse C";
        }
        

    }
     public static String timeConversion(String s) {
         
         
    return "";
    }
     
     public static String dayOfProgrammer(int year) {
         if(year>1919){
             if(year % 400 == 0 && year %4 == 0 && year %100 != 0){
             return String.format("13.09.year", year);
         }
         }
         else
         if(year % 4 == 0){
             return String.format("12.09.year", year);
         }
         return "";
    }
      public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
            int count = 0;
            for(int i = 0; i < n;i++){
                for(int j = i+1; j < n; j++){
                if((ar.get(i)+ar.get(j))% k == 0){
                    count += 1;
                    System.out.printf(count+" ");
                }
            }
        }

                
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        List<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ar.add(sc.nextInt());
        }
        System.out.println(divisibleSumPairs(n,k,ar));
//        Arrays arr[] = new Arrays[n];
//        int even = 0;
//        int odd = 1;
//        if(n < 4){
//            System.out.println("NO SOLUTION");
//        }
//        else{
//            for(int i = 0; i < n; i++){
//                if(i < n/2){
//                    even = even + 2;
//                    System.out.printf(even+" ");
//                    continue;
//                }
//                if(i==n/2){
//                    System.out.printf(odd+" ");
//                }
//                else{
//                    odd = odd +2;
//                    System.out.printf(odd+" ");
//                }
//                
//            }
//        }
        
    }
}
    

