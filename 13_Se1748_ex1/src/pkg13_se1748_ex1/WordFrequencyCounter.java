/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_se1748_ex1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author HieuSA
 */


public class WordFrequencyCounter {
    public static void main(String[] args) throws FileNotFoundException {
        

        // Read in the text file
        File file = new File("english_text_file.txt");
        Scanner scanner = new Scanner(file);

        // Extract words and add them to the ArrayList
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordsList.add(word);
            }
        }

        // Sort the ArrayList
        Collections.sort(wordsList);

        // Count the frequency of occurrence of each word
        for (String word : wordsList) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        // Print out each word and its frequency
        for (String word : frequencyMap.keySet()) {
            System.out.println(word + ": " + frequencyMap.get(word));
        }
    }
}

    class Entry{
        public static void main(String[] args) {
            ArrayList<String> wordsList = new ArrayList<String>();
            HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
            String paragraph = "When Russia invaded Ukraine a year ago the shelves of the Novus supermarket chain in quickly emptied as its supply chains domestic and overseas collapsed Fresh produce became scarce and panic buying spread deputy director general for operations at the popular outlet recalls how the business reeled before dealing Ukraine a hammer blow. Russia struck at power grids and sub-stations across the country, leading to outages during the freezing winter and hitting heavy industry hard. The economy shrank by a third last year the largest fall since Ukraine independence from the Soviet Union in 1991. Before Russia's invasion annual economic output had topped 200 billion";
            
        }
    }