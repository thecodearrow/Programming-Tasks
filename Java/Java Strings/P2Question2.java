/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author Prashanth 
 * TITLE: To replace all the consonants in the String with the next alphabet.  
 * Classes: class replaceConsonantsClass, public class P2Question2
 * Methods: String replaceString(String)
 *Variables:  String VOWELS, s1, replacedString, str;
 *            char[] ch
 *            int i,
 */


class replaceConsonantsClass {

    String replaceString(String s1) {
        char[] ch;
        ch = s1.toLowerCase().toCharArray();
        String VOWELS = "aeiou";

        for (int i = 0; i < ch.length; i++) {

            int index = VOWELS.indexOf(ch[i]);
            if (index == -1) //if vowels not present {
            {
                ch[i] = ++ch[i]; //replace consonant with the next alphabet
            }
        }

        String replacedString = new String(ch); //Passing the char array as arg
        return (replacedString);
    }

}

public class P2Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        replaceConsonantsClass r = new replaceConsonantsClass();
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println(r.replaceString(str));

    }

}
