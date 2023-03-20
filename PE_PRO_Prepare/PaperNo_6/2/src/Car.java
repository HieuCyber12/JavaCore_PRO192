/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class Car {
    private String maker;
    private int price;

    public Car() {
    }

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
 
    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", maker,price);
    }

    
    
}
