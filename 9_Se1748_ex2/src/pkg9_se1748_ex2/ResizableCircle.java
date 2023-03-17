/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_se1748_ex2;

/**
 *
 * @author HieuSA
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" + this.radius +'}';
    }

    @Override
    public void resize(int percent) {
         this.radius *= percent/100.0;
         System.out.printf("Circle after resize %d percent is: %f ",percent,this.radius);
    }
    
}
