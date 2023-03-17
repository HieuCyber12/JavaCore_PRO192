/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;
import java.util.*;
/**
 *
 * @author HieuSA
 */
public class Invoice extends Book {
    
    private String id;
    private HashMap<String, Integer> bookQuantities; // a mapping of books and their quantities
    private final double TAX = 0.1; // 10% tax
    private double totalPrice;

    public Invoice(String id, HashMap<String, Integer> bookQuantities, double totalPrice) {
        this.id = id;
        this.bookQuantities = bookQuantities;
        this.totalPrice = calculateTotalPrice(totalPrice);
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Integer> getBookQuantities() {
        return bookQuantities;
    }

    public double getTax() {
        return TAX;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Calculates the total price of the invoice including tax
    private double calculateTotalPrice(double total) { 
        return total * (1 + TAX);
    }
}


