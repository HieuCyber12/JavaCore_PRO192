/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }
    
    public Cylinder(double radius) {
        super(radius);
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
    public double getVolume(){
        return 3.14*Math.pow(this.getRadius(), 2)*height;
    }

    @Override
   public double getArea(){
    return Math.pow(this.getRadius(), 2) * Math.PI*2 + 2*Math.PI*this.getRadius()*height;
}

}
