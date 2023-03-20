/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.*;
/**
 *
 * @author HieuSA
 */
public class PersonList {
    ArrayList<Person> oldList = new ArrayList<>();

    
    public void dummyData(){
        Person p = new Person("C4", 9);
        oldList.add(p);
        Person p1 = new Person("C6",3);
        oldList.add(p1);
        Person p2 = new Person("C3",7);
        oldList.add(p2);
        Person p3 = new Person("A3",11);
        oldList.add(p3);
        Person p4 = new Person("C7",9);
        oldList.add(p4);
        Person p5 = new Person("C5",2);
        oldList.add(p5);
        Person p6 = new Person("C1",5);
        oldList.add(p6);
        Person p7 = new Person("C2",6);
        oldList.add(p7);
        Person p8 = new Person("C4",9);
        oldList.add(p8);
    }
    
    public void display(){
        for(int i = 0; i < oldList.size(); i++){
            System.out.println(oldList.get(i).toString());
        }
    }
    
    
}
