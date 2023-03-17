/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class DictionaryWord implements Comparable<Object> {
    private String word;
    private String meaning;

    public DictionaryWord(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public int compareTo(Object o) {
        DictionaryWord dw = (DictionaryWord) o;
        if(dw.getWord().compareTo(word) > 1){
            return 1;
        }
        else
            return -1;
    }
    
}
