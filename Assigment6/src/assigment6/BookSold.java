/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;

/**
 *
 * @author HieuSA
 */
public class BookSold extends Book {
    private int soldCount;

    public BookSold() {
    }

    public BookSold(String code,int soldCount) {
        super(code);
        this.soldCount = soldCount;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }
    
   
}
