/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author HieuSA
 */
public class SpecMango extends Mango{
    private int type;

    public SpecMango() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    public SpecMango(String source, int price, int type) {
        super(source, price);
        this.type = type;
    }

    public int getNewPrice(){
        if(type > 10){
            return type + 15;
        }
        else return type + 10;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", this.getSource(),this.getPrice(), this.getType() );
    }
    
    
}
