/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_se1748_ex1;
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
        HashMap<String, String> hmDic = new HashMap<>();
        hmDic.put("murderer", "Kills another person");
        hmDic.put("kidnapper", "Holds someone for ransom money");
        hmDic.put("burglar", "Breaks into a home to steal things");
        hmDic.put("forget", "Makes an illegal copy of something");
        hmDic.put("hacker", "Breaks into a home to steal things");
        hmDic.put("mugger", "Attacks and steals money from someone");
        hmDic.put("bank robber", "Steals money from a bank");
        hmDic.put("hijacker", "Takes control of an airplane");      
        
        // iterate over the sorted key-value pairs
        int i = 1;
        for (HashMap.Entry<String, String> entry : hmDic.entrySet()) {
            String index = String.format("%2d", i);
            String key = entry.getKey();
            String value = entry.getValue();
            String output = String.format("%s: %s - %s", index, key, value);
            System.out.println(output);
            i++;
            
        }
    
    }
    
}
