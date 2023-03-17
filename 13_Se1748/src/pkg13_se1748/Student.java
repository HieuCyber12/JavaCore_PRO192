/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_se1748;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HieuSA
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getNameAge(){
        return name + "-" + age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    public boolean equals(Object obj){
        return name.equals(((Student)obj).getName());
    }

    public int compareTo(Student obj){
        return (age - obj.age);
    }
}
    class Entry{
        public static void main(String[] args) {
             ArrayList<Student> al = new ArrayList();
             Student t = new Student("Trinh",18);
             al.add(new Student("LeXinh",20));
             al.add(new Student("Trinh",18));
             al.add(new Student("David",30));
             al.add(new Student("Anna",25));
             
             Collections.sort(al);
             
             for(Student obj:al){
                 System.out.println(obj.getNameAge());
             }
             for(int i = 0; i < al.size();i++){
                System.out.println(al.get(i).getNameAge());
            }
             System.out.println("Trinh?"+al.contains(t));

        }
           
       
    }