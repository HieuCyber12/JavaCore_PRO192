/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_se1748_ex1remake;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Statue extends Item {
    private int weight;
    private String color;

    public Statue(int weight, String color, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public Statue(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Statue() {
        weight = 0;
        color = "None";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%-10s %5d %5d %-10s", this.getCreator(),this.value,weight,color);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.println("Enter material: ");
        color = sc.nextLine();//To change body of generated methods, choose Tools | Templates.
    }
    
}
