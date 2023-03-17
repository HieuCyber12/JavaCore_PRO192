/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_se1748_ex1;

/**
 *
 * @author HieuSA
 */
import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue(int value,String creator , int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.colour = color;
    }

    public Statue(int weight, String color) {
        this.weight = weight;
        this.colour = color;
    }

    public Statue() {
        weight = 0;
        colour = "None";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    @Override
    public String toString() {
        return String.format("Statue: %4d %-10s %4dkg %-10s",getValue(),getCreator(),weight,colour);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        while(weight<0){
            System.out.println("Enter weight again: ");
            weight = Integer.parseInt(sc.nextLine());
        }
        weight = Integer.parseInt(sc.nextLine());
        System.out.println("Enter colour: ");
        colour = sc.nextLine();//To change body of generated methods, choose Tools | Templates.
    }
    
}
