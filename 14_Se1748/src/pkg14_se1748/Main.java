/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_se1748;
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
        TreeSet ts = new TreeSet();
        ts.add(5);
        ts.add(7);
        ts.add(2);
        ts.add(5);
        
        System.out.println("Size: " + ts.size());
        Iterator iter = ts.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        TreeSet ts2 = new TreeSet();
        ts2.add("Two");
        ts2.add("Five");
        ts2.add("Seven");
        ts2.add("Five");
        Iterator iter2 = ts2.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
        
        TreeSet ts3 = new TreeSet();
        ts3.add(new Student("Two",22));
        ts3.add(new Student("Seven",77));
        ts3.add(new Student("Five",55));
        ts3.add(new Student("Five",55));
        Iterator iter3 = ts3.iterator();
        while(iter3.hasNext()){
            System.out.println(iter3.next());
        }
        
        HashMap hm = new HashMap();
        hm.put(22, "Two");
        hm.put(77, "Seven");
        hm.put(55, "Five");
        System.out.println("Find? " +hm.get(77));
        Iterator it1 = hm.keySet().iterator();
        while(it1.hasNext()){
            Object key = it1.next();
            System.out.println(" - " + hm.get(key));
        }
        
        ArrayList <Student> a1 = new ArrayList<>();
        a1.add(new Student("Two",22));
        a1.add(new Student("Seven",77));
        a1.add(new Student("Five",55));
//        Collections.sort(a1);
        Collections.sort(a1, new Comparator<Student> (){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }       
        });
        Iterator it2 = a1.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
    
}
