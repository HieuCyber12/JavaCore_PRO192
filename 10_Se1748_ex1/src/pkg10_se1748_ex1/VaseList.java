/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_se1748_ex1;

/**
 *
 * @author HieuSA
 */
public class VaseList extends Vase {
    private final int MAX = 100;
    private int addVase = 0;
    Vase v[] = new Vase[MAX];
    
    public VaseList() {
    }


    public int getNumberOfVase() {
        return addVase;
    }

    public void setNumberOfVase(int numberOfVase) {
        this.addVase = numberOfVase;
    }

    @Override
    public void input() {
        super.input();
        
        for(int i = 2; i < addVase+2; i++){
            v[i] = new Vase();
            v[i].input();   
        }
    }

    public void display(){
        for(int i = 0; i < addVase+2; i++){
            System.out.println(v[i]);  
        }
    }
    
    public void searchByCreator(String creator){
        for(int i = 0; i < addVase+2; i++){
            if(creator.equals(v[i].getCreator())){
                System.out.println(v[i]);
            }
        }
    }
    public void sortByCreator(){
        Vase temp;
        for(int i = 0;i <addVase+2; i++ ){
            for(int j = i + 1; j < addVase + 2; j++){
                if(v[i].getCreator().compareTo(v[j].getCreator())>0){
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        display();
    }
    public void deleteByIndex(int index){
        for(int i = 0; i < addVase+2;i++ ){
            if(i == index){
                
            }
        }
    }
    
}
