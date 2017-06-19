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
 * TITLE: To check if a given string is a positive string
 * Classes: class PositiveStringClass, public class P2Question7
 * Methods:  Boolean checkPositive(String)
 * Variables: String str,s, char[] ch
 *            Boolean b,bool
 *            int diff,i
 */
class PositiveStringClass {

    Boolean checkPositive(String s) {
        Boolean bool = true;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            int diff = ch[i + 1] - ch[i];
            if (diff < 0) {
                bool = false;
                break;
            }

        }

        return (bool);
    }

}

public class P2Question7 {

    public static void main(String[] args) {

        PositiveStringClass p = new PositiveStringClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        Boolean b = p.checkPositive(str);
        if(b==true)
            System.out.println("Positive String!");
        else
            System.out.println("Negative String!");

    }

}
