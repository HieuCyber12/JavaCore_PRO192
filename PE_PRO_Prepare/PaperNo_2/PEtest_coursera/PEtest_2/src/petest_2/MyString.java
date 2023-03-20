/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petest_2;

import java.util.*;
import java.util.regex.Pattern;

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
            if (Pattern.matches(".*[02468].*", word)) {
                count++;
            }
        }
        return count;
    }
/*The regular expression "\d*[02468]\d*" matches any string that contains at least one even digit (0, 2, 4, 6, or 8). Here's a breakdown of how it works:

"\d*" matches zero or more digits.
"[02468]" matches exactly one even digit.
"\d*" matches zero or more digits again.
So the entire regular expression matches any string that contains zero or more digits, followed by an even digit, followed by zero or more digits.

The regular expression ".[02468]." matches any string that contains at least one even digit (0, 2, 4, 6, or 8) anywhere in the string. Here's a breakdown of how it works:

".*" matches zero or more characters.
"[02468]" matches exactly one even digit.
".*" matches zero or more characters again.
So the entire regular expression matches any string that contains zero or more characters, followed by an even digit, followed by zero or more characters.

In summary, the first regular expression matches strings that contain at least one even digit, but that even digit must be surrounded by digits (it cannot be at the beginning or end of the string). The second regular expression matches strings that contain at least one even digit anywhere in the string (it can be at the beginning, end, or middle of the string).*/
    @Override
    public String f2(String str) {
         String[] words = str.split(" ");
    int n = words.length;

    // Loop through the words array and remove the first palindrome word
    for (int i = 0; i < n; i++) {
       if(isPalindrome(words[i])){
           words[i]="YY";
           break;
       }
    }

    // Join the remaining words and return the resulting string
    return String.join(" ", Arrays.copyOfRange(words, 0, n));
}

    // Helper method to check if a given string is a palindrome
    private static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;   
        }
}
