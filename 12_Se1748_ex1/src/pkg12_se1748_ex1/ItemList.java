package pkg12_se1748_ex1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author HieuSA
 */
public class ItemList {

    Item t[];
    int itemIndex = 0;
    final int MAX = 100;
    Scanner sc = new Scanner(System.in);

    public ItemList() {
        t = new Item[MAX];
    }
    public void addItem(Item it){
        t[itemIndex] = it;
        itemIndex++;
    }
    
    public void addItem(){
        System.out.println("Enter Type (Vase/Statue): ");
        String type = sc.nextLine();
        if(type.equals("Vase")){
            t[itemIndex] = new Vase();
            t[itemIndex].input();
            itemIndex++;
        }
        else if(type.equals("Statue")){
            t[itemIndex] = new Statue();
            t[itemIndex].input();
            itemIndex++;
        }
    }
    
    public void displayAll(){
        int itemSize = itemIndex;
        for(int i = 0; i < itemSize; i++){
            System.out.println(t[i].toString());
        }
        System.out.println("");
    }
    
    public int searchByCreator(String creator){
        int itemSize = itemIndex;
        for(int i = 0; i < itemSize; i++){
            if(t[i].getCreator().compareTo(creator) > 1){
                return i;
            }
        }
        return -1;
    }
    
    public void update(int index){
        System.out.printf("Please update the item at index %d: \n",index);
        t[index].input();
    }
    
    public void sortByValue(){
        for(int i = 0; i < itemIndex;i++){
            for(int j = i+1;j < itemIndex; j++){
                if(t[i].getValue()>t[j].getValue()){
                    Item temp = new Item();
                    temp = t[i];
                    t[i]=t[j];
                    t[j]=temp;
                }
            }
        }
    }
    
    public boolean remove(int index){
        for(int i = 0; i < itemIndex; i++){
            if(i==index){
                t[i]=t[i+1];
                itemIndex--;
            }
        }
        return true;
    }
    
    public void sortByCreator(){
        for(int i = 0; i < itemIndex;i++){
            for(int j = i+1;j < itemIndex; j++){
                if(t[i].getCreator().compareTo(t[j].getCreator())>1){
                    Item temp = new Item();
                    temp = t[i];
                    t[i]=t[j];
                    t[j]=temp;
                }
            }
        }
    }
    
    public void partition2Types() {
    int left = 0;
    int right = itemIndex - 1;

    while (left < right) {
        while (left < right && t[left] instanceof Vase) {
            left++;
        }
        while (left < right && !(t[right] instanceof Vase)) {
            right--;
        }
        if (left < right) {
            Item temp = t[left];
            t[left] = t[right];
            t[right] = temp;
            left++;
            right--;
        }
    }
}
    
    public void addCorrectPart() {      
        Item[] vasePart = new Vase[itemIndex];
        Item[] statuePart = new Statue[itemIndex];
        int vaseIndex = 0;
        int statueIndex = 0;
        addItem();
    // Partition the items into two parts
        partition2Types();

    // Add the items to the correct parts
        for (int i = 0; i < itemIndex; i++) {
            if (t[i] instanceof Vase) {
                vasePart[vaseIndex++] = t[i];
            } else {
                statuePart[statueIndex++] = t[i];
            }
        }

    // Replace the original array with the two parts
        for (int i = 0; i < vaseIndex; i++) {
            t[i] = vasePart[i];
        }
        for (int i = 0; i < statueIndex; i++) {
            t[vaseIndex + i] = statuePart[i];
    }
}
    
    //Fix code to print 3top of each type vase and statue
    public void displayTop3(){
        Item[] vaseItems = new Item[itemIndex];
        Item[] statueItems = new Item[itemIndex];
        int vaseIndex = 0;
        int statueIndex = 0;
        for (int i = 0; i < itemIndex; i++) {
        if (t[i] instanceof Vase) {
            vaseItems[vaseIndex++] = t[i];
        } else if (t[i] instanceof Statue) {
            statueItems[statueIndex++] = t[i];
        }
    }

    // Sort the items in each array by value
        Arrays.sort(vaseItems, 0, vaseIndex, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return Double.compare(item2.getValue(), item1.getValue());
        }
    });
        Arrays.sort(statueItems, 0, statueIndex, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return Double.compare(item2.getValue(), item1.getValue());
        }
    });

    // Display the top 3 highest value items from each array
            System.out.println("Top 3 highest value vase items:");
            for (int i = 0; i < Math.min(3, vaseIndex); i++) {
                System.out.println(i+1+". "+vaseItems[i].toString());
            }
            System.out.println("Top 3 highest value statue items:");
            for (int i = 0; i < Math.min(3, statueIndex); i++) {
                System.out.println(i+1+". "+statueItems[i].toString());
    }
    }
}

