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
public class cLine {
     private cPoint startP, endP;

    public cLine(cPoint startP, cPoint endP) {
        this.startP = startP;
        this.endP = endP;
    }
    public cLine(int x1,int y1, int x2, int y2){
       startP = new cPoint(x1,y1);
       endP = new cPoint(x2,y2);
    }

    @Override
    public String toString() {
        return "cLine{" + "startP=" + startP + ", endP=" + endP + '}';
    }
    public double getLength(){
        double len;
        len = Math.sqrt(Math.pow(startP.getX() - endP.getX(),2)+Math.pow(startP.getY() - endP.getY(),2));
        return len;
    }
}
