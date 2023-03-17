/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_se1748_ex1;

import java.util.*;

class Word {
    private String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }
}

public class WordCount {
    public static void main(String[] args) {
        String text = "hello how are you what is your name hello are you well that is very good for you and you will feel happy is that right well well well and you look good my name is no one great to see you again very nice and nice girl in that university you can look at the man who is what you want";

        // Split the text into words
        String[] words = text.split(" ");

        // Count the occurrences of each word and save them in a set
        Set<Word> wordSet = new HashSet<>();
        for (String word : words) {
            boolean found = false;
            for (Word w : wordSet) {
                if (w.getWord().equals(word)) {
                    w.incrementCount();
                    found = true;
                    break;
                }
            }
            if (!found) {
                wordSet.add(new Word(word, 1));
            }
        }

        // Retrieve the count of a specific word
        String searchWord = "you";
        for (Word w : wordSet) {
            if (w.getWord().equals(searchWord)) {
                System.out.println(searchWord + " appears " + w.getCount() + " times in the text.");
                break;
            }
        }

        // Display the words in alphabetical order
        System.out.println("After sort: ");
        List<Word> sortedWords = new ArrayList<>(wordSet);
        Collections.sort(sortedWords, (Word w1, Word w2) -> w1.getWord().compareTo(w2.getWord()));
        sortedWords.forEach((w) -> {
            System.out.println(w.getWord() + " appears " + w.getCount() + " times in the text.");
        });
    }
}

