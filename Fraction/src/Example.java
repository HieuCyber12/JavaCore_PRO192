import java.util.Scanner;
import java.util.ArrayList;

public class Example {
    public static void main (String [] args) {
        ArrayList<String> list = new ArrayList<>();
   
        Scanner sc = new Scanner(System.in);
        
        do {
            String nhap = sc.nextLine();
            list.add(nhap);
            if(nhap.equals("ok") ){
                System.out.println(list +" "+ list.size());
                break;
            }
            
        }
        while ( true);
    }
}
