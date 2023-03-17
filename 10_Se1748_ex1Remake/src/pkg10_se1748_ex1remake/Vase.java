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
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        height = 0;
        material = "No material";
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.println("Enter material: ");
        material = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%-10s %5d %5d %-10s", this.getCreator(),this.value,height,material);
    }
}
