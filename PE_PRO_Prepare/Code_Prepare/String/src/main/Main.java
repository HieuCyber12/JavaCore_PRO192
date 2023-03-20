/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String s = "ab12 bcc de685 ca ba4 xyzw m1 a5 zz933 um8";
//        //1.Split into words then count nums of words
//        String[] words = s.split(" ");
//        int numWords = words.length;
//        System.out.println(numWords); // Output: 10
//        
//        //2.print shortest words
//        int shortestLength = words[0].length();
//        //find min length of word
//        for (String word : words) {
//            if (word.length() < shortestLength) {
//                shortestLength = word.length();
//            }
//        }
//        //print shortest world
//        System.out.println("Shortest words: ");
//        for (String word : words) {
//            if (word.length() == shortestLength) {
//                System.out.format("%s ",word);
//            }
//        }
//        System.out.println("");
//        //3.Remove all elements don't have any numbers
//        String regex = ".*\\d.*"; // regular expression to match any word containing at least one digit
//        List<String> newWordsList = new ArrayList<>();
//
//        for (String word : words) {
//            if (word.matches(regex)) {
//                newWordsList.add(word);
//            }
//        }
//
//        String newStr = String.join(" ", newWordsList).trim();
//        System.out.println(newStr);
//        
//        //4.Find the first shortest length then remove it
//        for(int i = 0; i < words.length;i++){
//            if(words[i].length() == shortestLength){
//                words[i]="";
//                break;
//            }
//        }
//        String result = String.join(" ", words).replaceAll("\\s+", " ").trim();
//        System.out.println(result);
//        
//        //5. Print all worlds have 'a' and 'b'
//        for (String word : words) {
//            if (word.contains("a") && word.contains("b")) {
//                System.out.format("%s ",word);
//            }
//        }
//        
//        //6. Print words end by 2 digit
//        System.out.println("");
//        for (String word : words) {
//            if (word.matches(".*\\d{2}$")) {
//                System.out.format("%s ",word);
//            }
//        }
//        
//        //7.Sorting 6 elements at last
//        System.out.println("");
//        Arrays.sort(words, words.length-6, words.length);
//        String result1 = String.join(" ", words);
//        System.out.format(result1);
//        System.out.println("");
//        
//        //8. Find the longest (first) word and replace it with its length number // de685 => 5
//        int maxLength = 0;
//        int longestIndex = -1;
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() > maxLength) {
//                maxLength = words[i].length();
//                longestIndex = i;
//            }
//        }

//        words[longestIndex] = String.valueOf(maxLength);

//        String output = String.join(" ", words);
//        System.out.println(output);
        
        //9. Swap the longest (first) and shortest (last) words for each other. // de685 a5
        
        //Comment this coode because it run but will be conflict with the others code above
        
//        int shortestIndex = -1;
//        
//        for (int i = 0; i < words.length; i++) {
//            if (shortestIndex == -1 || words[i].length() < words[shortestIndex].length()) {
//                shortestIndex = i;
//            }
//}
//        String temp = words[longestIndex];
////        System.out.println(temp);
//        words[longestIndex] = words[shortestIndex];
//        words[shortestIndex] = temp;
//        
//        System.out.println(longestIndex);
//        System.out.println(shortestIndex);
//        String output9 = String.join(" ", words);
//        System.out.println(output9);

        //10. Delete all letters, split into word-numbers, sort numbers descending? // 933 685 12 8 5 4 1
        
//        String input = "ab12 bcc de685 ca ba4 xyzw m1 a5 zz933 um8";
//        String numbersOnly = input.replaceAll("[^0-9]+", " ").trim(); //Require trim() or it will through error because whitespace
//        
//        String[] numberStrings = numbersOnly.split(" ");
//        int[] numbers = new int[numberStrings.length];
//
//        for (int i = 0; i < numberStrings.length; i++) {
//            numbers[i] = Integer.parseInt(numberStrings[i]);
//        }
//
//        Arrays.sort(numbers);
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }


        //Way2: 
        String input = "ab12 bcc de685 ca ba4 xyzw m1 a5 zz933 um8";
        String result = input.replaceAll("[^\\d\\s]+", ""); // remove all non-digits and non-whitespace characters
        String[] numbers = result.trim().split("\\s+"); // split the resulting string into an array of numbers
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]); // convert each number string to an int
        }
        Arrays.sort(nums); // sort the array of numbers in ascending order
        // reverse the sorted array to get the numbers in descending order
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

    }
    
}
