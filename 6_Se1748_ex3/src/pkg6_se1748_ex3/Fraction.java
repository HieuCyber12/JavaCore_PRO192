/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_se1748_ex3;

/**
 *
 * @author HieuSA
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(){};
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    
    public void addition(double a){
        System.out.println((double)getNumerator() / getDenominator() + a);
    }
   public void subtraction(double a){
        System.out.println((double)getNumerator() / getDenominator() - a);
    }
   public void multiplication (double a){
        System.out.println((double)getNumerator() / getDenominator() * a);
    }
   public void division (double a){
        System.out.println((double)getNumerator() / getDenominator() / a);
    }
}
