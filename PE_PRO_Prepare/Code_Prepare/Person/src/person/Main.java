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
public class Main {
    //f1
    public static void f1(ArrayList<Person> oldList) {
        ArrayList<Person> newList = new ArrayList<Person>();
        
        for (Person p : oldList) {
            if (p.getAge() > 4 && p.getName().charAt(0) != 'A') {
                newList.add(p);
            }
        }
        
        System.out.println("oldList: " + oldList);
        System.out.println("newList: " + newList);
    }
    //f2
    public static void f2(ArrayList<Person> oldList) {
    int count = 0;
    
    for (int i = 0; i < oldList.size(); i++) {
        if (oldList.get(i).getAge() < 6) {
            count++;
            if (count == 2) {
                System.out.println("Removed: " + oldList.get(i));
                oldList.remove(i);
                break;
            }
        }
    }
    
    System.out.println("List after removed: "+oldList);
}
    //f3
    public static void f3(ArrayList<Person> oldList) {
    ArrayList<Person> sublist = new ArrayList<Person>(oldList.subList(0, 5));
    
    Collections.sort(sublist, new Comparator<Person>() {
        public int compare(Person p1, Person p2) {
            int result = p1.getName().compareTo(p2.getName());
            if (result == 0) {
                result = p1.getAge() - p2.getAge();
            }
            return result;
        }
    });
    System.out.println("Old List:"+oldList);
    for(int i = 0; i<5;i++){
        oldList.add(i, sublist.get(i));
    }
    
    System.out.println("After sorted: " + oldList);
//        System.out.println(sublist);
    
    
}
    
    //f4 
    public static void f4(ArrayList<Person> list) {
    if (list.size() <= 1) {
        return;
    }
    int i = 0, j = list.size() - 2;
    while (i < j) {
        Person temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        i++;
        j--;
    }
}
    
    //f5
    public static void f5(ArrayList<Person> list) {
    if (list.size() <= 1) {
        return;
    }
    list.remove(list.size() - 2);
}
    
    //f6
    public static void f6(ArrayList<Person> list) {
    for (Person p : list) {
        if (p.getName().equals("C6")) {
            p.setName("CX");
            break;
        }
    }
}

    public static void main(String[] args) {
        ArrayList<Person> oldList = new ArrayList<Person>();
        oldList.add(new Person("C4", 9));
        oldList.add(new Person("C6", 3));
        oldList.add(new Person("C6", 7));
        oldList.add(new Person("A3", 11));
        oldList.add(new Person("C7", 9));
        oldList.add(new Person("C5", 2));
        oldList.add(new Person("C1", 5));
        oldList.add(new Person("C2", 6));
        oldList.add(new Person("A4", 9));
        
        f1(oldList);
//        f2(oldList);
//        f3(oldList);
//        System.out.println("Before reversed: " + oldList);
//        f4(oldList);
//        System.out.println("After reversed: " + oldList);
//        System.out.println("Before removed: " + oldList);
//        f5(oldList);
//        System.out.println("After removed: " + oldList);
        System.out.println("Before changed: " + oldList);
        f6(oldList);
        System.out.println("After changed: " + oldList);
       
    }
    
}
