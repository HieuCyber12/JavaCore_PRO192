/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_se1748;
import java.io.*;
/**
 *
 * @author HieuSA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("f1.txt.");
        
        if(!f.exists()){
            System.out.println("f1.txt NOT Found");
            try{
                f.createNewFile();
            }
            catch(IOException ex){
                
            }
        }
        
        try{
            String fileName = "data.txt";
            FileWriter fw = new FileWriter(fileName,true);
            PrintWriter pw = new PrintWriter(f);
            pw.println("How");
            pw.print("hello\nbye");
            
            pw.close();
            fw.close();
            
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while((line = br.readLine()) != null){
                System.out.println("-"+line);
            }
            br.close();
            fr.close();
        }
        catch(IOException ex){
            
        }
    }
    
}
