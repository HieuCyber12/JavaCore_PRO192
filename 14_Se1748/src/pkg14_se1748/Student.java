/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_se1748;

/**
 *
 * @author HieuSA
 */
public class Student implements Comparable <Object>{
    String name;
    int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + "-" + id;
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        if(id > st.id) return 1;
        else if(id < st.id) return -1;
        else return 0;
    }
    
    
}
