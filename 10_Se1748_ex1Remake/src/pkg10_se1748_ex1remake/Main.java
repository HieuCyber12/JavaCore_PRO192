/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_se1748_ex1remake;

/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VaseList vaseList = new VaseList();
        vaseList.addVase(new Vase(300,"Biden",200,"Wood"));
        vaseList.addVase(new Vase(80,"Dicanio",50,"Soil"));
        vaseList.input();
        System.out.println("The list of vases are: ");
        vaseList.display();    
        
        System.out.println("\nThe vase you want to find: ");
        System.out.println(vaseList.searchByCreator("Biden"));

        vaseList.removeByIndex(2);
        System.out.println("\nThe vase list after remove an elements: ");
        vaseList.display();

        System.out.println("\nThe vase list after sorted: ");
        vaseList.sortByCreator();
        vaseList.display();      
    }
    
}
