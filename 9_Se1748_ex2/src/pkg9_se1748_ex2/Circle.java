/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_se1748_ex2;

/**
 *
 * @author HieuSA
 */
public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    
}
