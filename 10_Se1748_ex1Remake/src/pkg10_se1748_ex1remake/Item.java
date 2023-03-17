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
public class Item {
    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
        value = 0;
        creator = "No Creator";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.println("Enter creator's name: ");
        creator = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("Creator: %-10s, Value: %d", creator,value);
    }
}
