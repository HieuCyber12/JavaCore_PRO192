/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_se1748_ex2;
import com.sun.xml.internal.ws.util.StringUtils;
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
        Scanner sc = new Scanner(System.in);
        //Ex0: 
        String str = "Hey, you are a good one. I love you very much, do you know that Mylord";
          int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        //Ex1:
        System.out.println("Enter a string to check if it's a palindrome:");
        String palindrome = sc.nextLine();
        if (isPalindrome(palindrome)) {
            System.out.println(palindrome + " is a palindrome.");
        } else {
            System.out.println(palindrome + " is not a palindrome.");
        }
        
        //Ex2:
        
        List<Integer> youPositions = new ArrayList<>();
        List<Integer> loPositions = new ArrayList<>();
        int youCount = 0, loCount = 0;
        str = str.toLowerCase();
        String[] words = str.split("\\s+|,\\s*|\\.\\s*|\\?\\s*");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("you")) {
                youCount++;
                youPositions.add(i);
            }
            if (words[i].contains("lo")) {
                loCount++;
                loPositions.add(i);
            }
        }
        System.out.println("you => " + youCount + " times");
        System.out.println("you positions: " + youPositions.toString());
        System.out.println("lo => " + loCount + " times");
        System.out.println("lo positions: " + loPositions.toString());
        
        //Ex3: 
        // Checking if the string is symmetric along each word
        System.out.println("Enter a string to check if it's symmetric along each word:");
        String symmetricString = sc.nextLine();
        if (isSymmetric(symmetricString)) {
            System.out.println(symmetricString + " is symmetric along each word.");
        } else {
            System.out.println(symmetricString + " is not symmetric along each word.");
        }
        
        //Ex4:       
        
        System.out.println("Input name: ");
        String name = sc.nextLine().toLowerCase();
        name = name.replaceAll("\\s+|,\\s*|\\.\\s*|\\?\\s*|\\!\\s*|\\-\\s*|\\:\\s*|\\;\\s*", " ").trim();
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;


        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) {
            // check space is present before the letter
                if(foundSpace) {
            // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
              // if the new character is not character
              foundSpace = true;
            }
    }
            
            // convert the char array to the string
            name = String.valueOf(charArray);
            System.out.println(name);
            
        //  Resolving by StringBuilder

//        String s[] = name.split("[\\s|.|?|,]+");
//        for(int i = 0; i < name.length()-1;i++){
//            System.out.printf(s[i]);
//        }

//            String name = sc.nextLine().trim().toLowerCase();
//
//        StringBuilder sb = new StringBuilder();
//        boolean capitalizeNext = true;
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.charAt(i);
//            if (ch == ' ') {
//                capitalizeNext = true;
//                sb.append(" ");
//            } else if (Character.isLetter(ch)) {
//                if (capitalizeNext) {
//                    sb.append(Character.toUpperCase(ch));        
//                    capitalizeNext = false;
//                } else {
//                    sb.append(ch);
//                    
//                }
//            }
//        }
//
//        System.out.println("Standardized name: " + sb.toString());
    
        
        
        //Ex5:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String hexString = scanner.nextLine().toUpperCase();
        boolean isHex = true;
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (!isHexDigit(ch)) {
                isHex = false;
                break;
            }
        }
       
        
        if (isHex) {
            int decimalValue = Integer.parseInt(hexString, 16);
            System.out.println("Base-10 value: " + decimalValue);
        } else {
            System.out.println("Error: Input string is not a valid hexadecimal string.");
        }
        //Ex6
        String str6 = "   Hey,   you   \n are a good one. I love you very much  one  two three, do you know that Mylord.  ";
        String[] words6 = str6.split("\\s+|,\\s*|\\.\\s*|\\?\\s*");
        HashMap<String, Integer> wordCounts = new HashMap<>();
        
        for(String word: words6){
            if(wordCounts.containsKey(word)){
                int count = wordCounts.get(word);
                wordCounts.put(word, count+1);
            }else{
                wordCounts.put(word,1);
            }
        }
        System.out.println("The words are not duplicate: ");
        for(String word :words6){
            if(wordCounts.get(word) == 1){
                System.out.println(word);
            }
        }
        
        String mostRepeatedWord = null;
        int maxCount = 0;
        for(String word: wordCounts.keySet()){
            int count = wordCounts.get(word);
            if(count > maxCount){
                maxCount = count;
                mostRepeatedWord = word;
            }
        }
//        System.out.format("Word is the most duplicated is %s ",mostRepeatedWord,maxCount);
        System.out.println("Word is the most duplicated is " + mostRepeatedWord + " with "+maxCount+" appearence");    
    
        //Ex7: 
        List <Integer> list1= Arrays.asList(5, 6, 19, 28, 2, 1, 6, 8, 11, 16);
        List <Integer> list2= Arrays.asList(23, 3, 12, 29, 10, 3, 9, 22, 1, 4);
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        if(intersection.size() > 0){
            System.out.println("Two lists intersection at: " + intersection);
        }
        else{
            System.out.println("Two lists aren't intersection");
        }
        List<Integer>list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List 3 contain: " + list3);
        int countEight = 0;
        int max = Collections.max(list3);
        int min = Collections.min(list2);
        
        for(int num : list3){
            if(num==8){
                countEight++;
            }
        }
        
        System.out.println("Max of list 3 is: " + max);
        System.out.println("Min of list 3 is: " + min);
        System.out.printf("Number 8 of list 3 appear %d times: ",countEight);
        Collections.sort(list3,Collections.reverseOrder());
        System.out.println("After sorted: " + list3);
        Collections.shuffle(list3);
        System.out.println("After shuffered: " + list3);
        
        HashSet<Integer> hs3 = new HashSet();
        hs3.addAll(list3);
        System.out.println("Order set after remove duplicate: "+hs3);
        
        String sample = "Encodes this String into a sequence of bytes using the named charset storing the result into a new byte array String that represents the characters of the array specified CharSequence or StringBuffer int a boy be two";
        String[] words7 = sample.split(" ");
        List<String> wordList = Arrays.asList(words7);
        
        Comparator<String> sortByLength = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }

        };
        
        wordList.sort(sortByLength);
        System.out.println("List of words after sorted: " + wordList);
        
        String sample2 ="abcd";
        List<String> substrings = new ArrayList<>();
        
        for(int i = 0; i < sample2.length();i++){
            for(int j = i+1; j < sample2.length();j++){
                substrings.add(sample2.substring(i, j));
            }
        }
        
        Collections.sort(substrings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
               return Integer.compare(s2.length(), s1.length());
            } 
        });
        
        System.out.println(substrings);
    }

     public static boolean isHexDigit(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F');
    }
    
    public static boolean isSymmetric(String str) {
        str = str.toLowerCase();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!isPalindrome(word)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
    
       
  

   
    
    

