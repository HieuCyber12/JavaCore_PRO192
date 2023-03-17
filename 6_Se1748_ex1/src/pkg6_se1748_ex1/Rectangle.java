/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_se1748_ex1;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){}
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: \n");
        width = Double.parseDouble(sc.nextLine());
        System.out.print("Enter height: \n");
        height = Double.parseDouble(sc.nextLine());       
    }
    
    public double calculate(){
        double perimeter = (width + height)*2;
        return perimeter;
    }
    
    public void display(){
        System.out.format("The width and height of the rectangle are: %f and %f\n",width,height);
        System.out.println("The perimeter is: " + calculate());
    }
    
}
