/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.io.*;
import java.util.*;
/**
 *
 * @author Prashanth
 */
public class FileHandling {

    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();
        a.add(147885);
        a.add(2467);
        a.add(300);
           Collections.sort(a);
       ListIterator<Integer> itr=a.listIterator();


       itr.next();
       itr.next();
       itr.next();
        while(itr.hasPrevious()){

            System.out.println(itr.previous());
        }



    }



}
