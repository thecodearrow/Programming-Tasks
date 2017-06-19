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
 * TITLE: To perform various string operations based on user's choice
 * Class: class StringOpsClass, public class P2Question6
 *LOGIC: For removing duplicates, use a HashSet since the values are all unique.
 *       Run a loop and check if current character is present in HashSet
 *       If NOT PRESENT, add it to hashSet and also to the StringBuffer
 * Methods: String addStringtoSelf(String )
 *          String replaceAltPos(String )
 *          String removeDupChars(String )
 *          String changeAltCharsToCaps(String )
 *          String changeString(String , char )
 * Variables: int i;
 *           char[] ch; char ch, char choice
 *           String str,s,temp,out,output;
 *           StringBuffer s_no_dups;
 * 
 *
 */
class StringOpsClass {

    String addStringtoSelf(String s) {
        return (s + s);  //concatenates string to self
    }

    String replaceAltPos(String s) {

        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2) {
            ch[i] = '*';

        }
        String out=new String(ch);
        return (out);
    }

    String removeDupChars(String s) {
        StringBuffer s_no_dups = new StringBuffer();
        HashSet<Character> hs = new HashSet<>();
        char[] ch = s.toCharArray();
        for (char i : ch) {
            if (!hs.contains(i)) {
                hs.add(i);
                s_no_dups.append(i);
                //appends to StringBuffer without adding dups

            }

        }
        return (s_no_dups.toString());
    }

    String changeAltCharsToCaps(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2) {
            String temp = String.valueOf(ch[i]);
            //Using Wrapper Class Methods for Character
            ch[i] = Character.toUpperCase(ch[i]);

        }
        String out=new String(ch);
        return (out);
    }

    String changeString(String s, char ch) {
        String output;
        switch (ch) {
            case 'A':
                output = addStringtoSelf(s);
                break;
            case 'B':
                output = replaceAltPos(s);
                break;
            case 'C':
                output = removeDupChars(s);
                break;
            case 'D':
                output = changeAltCharsToCaps(s);
                break;
            default:
                System.err.println("Invalid choice!");
                output = null;

        }
        return (output);
    }

}

public class P2Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringOpsClass sop = new StringOpsClass();
        System.out.println("Enter the string:");
        String str = sc.next();
        System.out.println("A: Add the String to itself  \n"
                + "B: Replace alternate positions with *  \n"
                + "C: Remove duplicate characters in the String  \n"
                + "D: Change alternate characters to upper case ");
        System.out.println("Enter your choice:");
        char choice = sc.next().trim().charAt(0);
        //Just to be safe with whitespaces
        System.out.println("OUTPUT: " + sop.changeString(str, choice));

    }
}
