/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class Cake {
    private String maker;
    private int price;

    public Cake() {
    }

    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        
        String[] words = maker.toLowerCase().trim().split("");
        int length = words.length;
        words[length-1] = words[length-1].toUpperCase();
        return String.join("", words).trim();
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
