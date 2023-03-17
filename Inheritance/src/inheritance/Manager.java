/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author HieuSA
 */
public class Manager extends Employee {
    
    private int bonus;
    public Manager(String name, int salary, int bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public void display() {
        super.display();
        System.out.println(bonus);
    }
}
