/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petest_1;

/**
 *
 * @author HieuSA
 */
public class SpecCala extends Cala {
    private int color;

    public SpecCala() {     
    }

    public SpecCala( String owner, int price,int color) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    /*
    Convert:
    - The first letter of all words is converted to uppecase
    - All the other letter are converted to lowercase
    */
    public void setData(){
        String owner = this.getOwner();
        String result = "";
        if(owner != null && !owner.isEmpty()){
            String [] words = owner.toLowerCase().split("\\s+");
            for(String word:words){
                result += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
            }
            result = result.trim();
        }
        System.out.println(result);
    }
    public int getValue(){
        if(color % 2 == 0){
            return this.getPrice()+1;
        }
        else
            return this.getPrice()*2;
    }
    
    @Override
    public String toString() {
        return String.format("%s @ %d # %d", this.getOwner(),this.getPrice(),this.getColor());
    }

    
   
    
}
