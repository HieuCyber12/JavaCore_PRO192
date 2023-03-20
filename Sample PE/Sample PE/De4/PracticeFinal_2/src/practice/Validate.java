/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Validate {

    //count and return number of book which has code contain digit and letter
    public int f1(List<Book> a) {
        return 0;

    }

    //count and return number of book which has code start with "c"
    //the comparation must ignore case
    public int f2(List<Book> a) {

        return 0;
    }

    //sort books assending by price if price greater or equals 20
    //if book have price smaller than 20 then keep the position 
    public void f3(List<Book> a) {

    }

    //sort list assending by first name of book.
    public String f4(List<Book> a) {

        return "";
    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code:mln1051309HN
    public void f5(List<Book> a) {

    }

    //remove last book which has price = min price
    public void f6(List<Book> a) {

    }

    //sort assending by price, if price equal then assending by name
    public void f7(List<Book> a) {

    }

    //return list book có brand là "truyen tranh"
    public List<Book> f8(List<Book> a) {
        return null;
    }

    //sort ascending list from index
    public void f9(List<Book> a, int index) {

    }

    //sort ascending book in list which has brand is "truyen dai"
    // các vị trí khác không thay đổi
    public void f10(List<Book> a) {

    }
    //read data from file
    //data of booklist.dat
            //song da;truyen dai;abc105hA1309ab;22
            //lao hac;truyen dai;abH105hA1309ab;20
            //song hong;truyen dai;abc105hA1309ab;21
            //lan va diep;truyen dai;abH105hA1309ab;25
    //upper case first letter name of book
    //sort decreasing by price
    public List<Book> f11(String fileName) {
        return null;
    }
    //xóa book đứng sau book cuối cùng cái mà có price nhỏ nhất 
    public void f12(List<Book> a) {

    }

}




















































//List<Book> list = new ArrayList<>();
//        File file = new File(fileName);
//        try {
//            Scanner read = new Scanner(file);
//            while (read.hasNext()) {
//                String perLine = read.nextLine();
//                String[] txt = perLine.split(";");
//                list.add(new Book(txt[0], txt[1], txt[2], Double.parseDouble(txt[3])));
//            }
//        } catch (FileNotFoundException ex) {
//        }
//        return list;