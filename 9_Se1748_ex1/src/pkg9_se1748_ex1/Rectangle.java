/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_se1748_ex1;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Rectangle extends Shape implements GeometricObject {
     int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    @Override
    public double calArea() {
       return length * width;
    }

    @Override
    public double calPerimeter() {  
       return (length + width)*2;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
    }

    @Override
    public void display() {
        System.out.printf("Rec:L=%d,W=%d.Color:%s",length,width,color);
    }
    
    
}
