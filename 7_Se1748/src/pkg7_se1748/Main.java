/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_se1748;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        cPoint p1,p2;
//        p1 = new cPoint(1,1);
//        p2 = new cPoint(4,5);
//        System.out.println(p2);
//        cLine line = new cLine(p1,p2);
//        System.out.println(line);
//        System.out.println("Length= "+ line.getLength());
            cPoint a,b,c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter point A: ");
            a = new cPoint(sc.nextInt(),sc.nextInt());
            System.out.print("Enter point B: ");
            b = new cPoint(sc.nextInt(),sc.nextInt());
            System.out.print("Enter point C: ");
            c = new cPoint(sc.nextInt(),sc.nextInt());
            Triangle t = new Triangle(a,b,c);
            
            System.out.println("The perimeter of triangle is: " + t.getPerimeter());
            System.out.println("The area of triangle is: " + t.getArea());
            if(t.isRightTriangle())
                 System.out.println("The triangle is right tringle");
            else
                 System.out.println("The triangle is not right tringle");

            
    }
    
}
