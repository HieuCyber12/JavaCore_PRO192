package pkg10_se1748_ex1remake;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author HieuSA
 */
public class VaseList extends Vase {
    
   private ArrayList<Vase> vases;
   Scanner sc = new Scanner(System.in);
    public VaseList() {
        vases = new  ArrayList<Vase>() ;
    }

    @Override
    public void input() {
        
        System.out.println("Enter the number of vases: ");
        int numVases = Integer.parseInt(sc.nextLine());
        for(int i = 2; i < numVases + 2; i++){
            Vase vase = new Vase();
            System.out.println("Enter details for vase" + (i+1) + ": ");
            System.out.println("Creator: ");
            vase.setCreator(sc.nextLine());
            System.out.println("Value: ");
            vase.setValue(Integer.parseInt(sc.nextLine()));
            System.out.println("Height: ");
            vase.setHeight(Integer.parseInt(sc.nextLine()));
            System.out.println("Material: ");
            vase.setMaterial(sc.nextLine());
            addVase(vase);
        }
    }
    
    public void addVase(Vase vase){
        vases.add(vase);
    }
    
    public void removeByIndex(int index){
        vases.remove(index);
    }
   
    public void sortByCreator(){
        Collections.sort(vases, new Comparator<Vase>(){
            @Override
            public int compare(Vase vase1, Vase vase2){
                return vase1.getCreator().compareTo(vase2.getCreator());
            }
        });
    }
   //Cannot run
    public Vase searchByCreator(String creator){
        for(Vase vase : vases){
            if(vase.creator.compareTo(creator)>1){
                return vase;
            }
        }
       return null;
    }
    
    public void display(){
        for(Vase vase : vases){
            System.out.println(String.format("%-10s %5d %5d %-10s", vase.getCreator(),vase.value,vase.getHeight(),vase.getMaterial()));
        }
    }
}
