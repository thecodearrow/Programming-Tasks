/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.*;

/**
 *
 * @author Prashanth 
 * TITLE:Generate the mirror image of a String and add it to the existing string.
 * Classes: class MirrorImageString, class P2Question1
 * Methods: String getImage(String) 
 * Variables: String str,String s, StringBuffer s1. StringBuffer s2,String mirror;
 */
class MirrorImageString {

    String getImage(String s) {

        StringBuffer s1 = new StringBuffer(s);
        StringBuffer s2 = s1.reverse();
        String mirror = s1 + " | " + s2;
        return (mirror);
    }

}

public class P2Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MirrorImageString ms = new MirrorImageString();
        System.out.println("Enter the string you want to reverse: ");
        String str = sc.next();
        System.out.println(ms.getImage(str));
    }

}
