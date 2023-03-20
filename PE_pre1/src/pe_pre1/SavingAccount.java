/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe_pre1;

/**
 *
 * @author HieuSA
 */
public class SavingAccount {
    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getMoney() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public boolean savingWithdraw(int money){
        if(money > 0 && money < balance){
            balance = balance - money;
            return true;
        }
        return false;
    }
    
    public boolean savingDeposite(int money){
        if(money > 0){
            balance = balance + money;
            return true;
        }
        return false;
    }
    
    
}
