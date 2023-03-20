/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HieuSA
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", this.getMaker(),this.getPrice(),type);
    }

    public void setData(){
        this.setMaker("XZ"+this.getMaker());
        this.setPrice(this.getPrice()+20);
    }
    
    public int getValue(){
        int inc = 15;
        if(type < 7){
            inc = 10;
        }
        return this.getPrice()+inc;
    }
    
}
