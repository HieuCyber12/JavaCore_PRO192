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
public class Vase {
    private String maker;
    private int type;

    public Vase() {
    }

    public Vase(String maker, int type) {
        this.maker = maker;
        this.type = type;
    }

    
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)", maker,type);
    }
    
    
}
