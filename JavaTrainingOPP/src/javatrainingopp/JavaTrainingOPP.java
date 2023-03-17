package javatrainingopp;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */
public class JavaTrainingOPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student("Ha Viet Hieu", 22);
   
//        st.name = sc.nextLine();
//        st.age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Your info is " + st.name +", "+ st.age);
//    }
        st.setAge(-5);

//        System.out.println(st.getName());
    
    }
}
