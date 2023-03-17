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
public class Book {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    public Book() {
    }

    public Book(String code, String name, double unitPrice, int quantity) {
        //Code
        if(isCodeValid(code)){
            this.code = code;
        }
        else{
           codeErrThrow();
        }
        
        //Name
        if(isNameValid(name)){
            this.name = name;
        }
        else
        {
            nameErrThrow();
        }
        
        //Price
        if(isPriceValid(unitPrice)){
            this.unitPrice = unitPrice;
        }
        else{
            priceErrThrow();
        }
            
        this.quantity = quantity;
    }

    //isValidate checking
    public boolean isCodeValid(String code){
        return code.matches("[A-Z]\\d{3}");
    }
    
    public boolean isNameValid(String name){
        return name.length() <= 50;
    }
    
    public boolean isPriceValid(double unitPrice){
        return (unitPrice >= 0 && unitPrice < 10000);
    }
    //Error throwing
    public void codeErrThrow(){
        throw new IllegalArgumentException("Invalid Book code format. Book code should contain exactly 4 characters, starting with an uppercase letter (A-Z) and followed by three digits (0-9).");
    }
    
    public void nameErrThrow(){
        throw new IllegalArgumentException("Book name should contain no more than 50 characters.");
    }
    
    public void priceErrThrow(){
        throw new IllegalArgumentException("The price of book must be a positive value and less than 10.000$");
    }
    //Getter and Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(isCodeValid(code)){
            this.code = code;
        }
        else{
            codeErrThrow();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isNameValid(name)){
            this.name = name;
        }
        else
        {
            nameErrThrow();
        }
        
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(isPriceValid(unitPrice)){
            this.unitPrice = unitPrice;
        }
        else{
            priceErrThrow();
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %lf, %d",this.code,this.name,this.unitPrice,this.quantity);
    }
    
    
}
