/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class SpecCoffee extends Coffee {
    private int price;

    public SpecCoffee() {
        
    }

    public SpecCoffee(String name, int size,int price) {
        super(name, size);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", this.getName(),this.getSize(),this.getPrice());
    }
    
    public void setData(){
        this.setName("CF"+this.getName().trim());
    }
    
    public int getValue(){
        if(this.getSize() > 10){
            return price;
        }
        else
            return price+5;
    }
}
