/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 * TITLE: Binary to Decimal Conversion
 * Class:  public class Question1
 * Methods:  String convert(String), Boolean isBinary(String)
 * Variables: String binary, int decimal_int, Boolean bool,char ch, String bin
 *
 * @author Prashanth
 */
public class Question1 {

    String convert(String binary) {
        if (isBinary(binary)==true) {
            int decimal_int = Integer.parseInt(binary, 2);
            String decimal_string = Integer.toString(decimal_int);
            System.out.print("The equivalent decimal number for binary \""
                    + binary +"\" is ");
            return (decimal_string);
        } else {
            return ("Invalid Binary String " + binary);
        }

    }

    Boolean isBinary(String binary) {
        Boolean bool = true;
        //string.toCharArray() creates a character array out of a String. 
        for (char ch : binary.toCharArray()) {
            if (ch != '0' && ch != '1') {
             
                bool = false;
            }

        }
        return (bool);
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary String:");
        String bin = sc.nextLine();
        System.out.println( q.convert(bin));

    }
}
