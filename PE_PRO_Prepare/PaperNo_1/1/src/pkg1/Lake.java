/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author HieuSA
 */
public class Lake {
    private String place;
    private int depth;

    public Lake() {
    }

    public Lake(String place, int depth) {
        this.place = place;
        this.depth = depth;
    }

    public String getPlace() {
        return place.toUpperCase();
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    
}
