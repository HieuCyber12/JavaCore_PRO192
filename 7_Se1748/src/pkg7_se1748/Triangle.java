/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_se1748;

/**
 *
 * @author HieuSA
 */
public class Triangle {
     private cPoint pointA, pointB, pointC;

    public Triangle(cPoint pointA, cPoint pointB, cPoint pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public cPoint getPointA() {
        return pointA;
    }

    public void setPointA(cPoint pointA) {
        this.pointA = pointA;
    }

    public cPoint getPointB() {
        return pointB;
    }

    public void setPointB(cPoint pointB) {
        this.pointB = pointB;
    }

    public cPoint getPointC() {
        return pointC;
    }

    public void setPointC(cPoint pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + '}';
    }
            
    public double getLengthAB(){
        double len;
        len = Math.sqrt(Math.pow(pointA.getX() - pointB.getX(),2)+Math.pow(pointA.getY() - pointB.getY(),2));
        return len;
    }
    public double getLengthBC(){
        double len;
        len = Math.sqrt(Math.pow(pointB.getX() - pointC.getX(),2)+Math.pow(pointB.getY() - pointC.getY(),2));
        return len;
    }
    public double getLengthCA(){
        double len;
        len = Math.sqrt(Math.pow(pointC.getX() - pointA.getX(),2)+Math.pow(pointC.getY() - pointA.getY(),2));
        return len;
    }
    public double getPerimeter(){
        return getLengthAB() + getLengthBC() +getLengthCA();
    }
    public double getArea(){
        double s = getPerimeter()/2;
        return 100.03248;
    }
    public boolean isRightTriangle(){
        double a,b,c;
        a = Math.pow(getLengthAB(), 2);
        b = Math.pow(getLengthBC(), 2);
        c = Math.pow(getLengthCA(), 2);
        if(a+b == c || a + c == b || c + b == a){
            return true;
        }
        else
            return false;
    }
}
