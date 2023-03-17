/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_se1748_ex1;
import java.io.*;
import java.util.*;
/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
//            Employee nvl = new Employee("B007","Jame Bond",3);
//            Employee nv2 = new Employee("E001","Messi J",1000);
////            Employee nv3 = new Employee(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
////            Employee nv4 = new Employee(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
//            String fileName="data.txt";
//            
//            FileWriter fw = new FileWriter(fileName,true);
//            PrintWriter pw = new PrintWriter(fw);
//            pw.println(nvl.code +","+nvl.name+","+nvl.salary);
//            pw.println(nv2.code +","+nv2.name+","+nv2.salary);
//            pw.close();
//            fw.close();
//            
//            FileReader fr = new FileReader(fileName);
//            BufferedReader br = new BufferedReader(fr);
//            String line ="";
//            while((line=br.readLine()) != null){
//                String s[] = line.split(",");
//                int salary = Integer.parseInt(s[2]);
//                Employee emp = new Employee(s[0],s[1],salary);
//                System.out.println(emp);
//            }
//            br.close();
//            fr.close();
            Employee nv1 = new Employee("B007","Jame Bond",3);
            Employee nv2 = new Employee("E001","Messi J",1000);
            Employee nv3 = new Employee("E006","Trump",5000);
            String fileName = "data1.txt";
            
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(nv1);
            ous.writeObject(nv2);
            ous.writeObject(nv3);
            ous.close();
            fos.close();
            
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp = new Employee();
            while( (emp = (Employee)ois.readObject() ) != null ){
                System.out.println(emp);
        }
            fis.close();
            ois.close();
    }
        catch(Exception ex){}
    }
    
}
