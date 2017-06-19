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
 * TITLE: To modify a number such that the each of the digit in the newly formed
 * number is equal to the difference between two consecutive digits in the 
 * original number. 
 * 
 * Classes: class ModifyNumberClass, public class P2Question5
 * Methods: int modifyNumber(int)
 * Variables:  String number_string, StringBuffer number_buff
 *             int first,second,num,new_num,diff,i
 *             char[] ch
 * 
 */
class ModifyNumberClass {

    int modifyNumber(int number1) {
        String number_string = Integer.toString(number1);
        StringBuffer number_buff = new StringBuffer();
        char[] ch = number_string.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            int first = ch[i];

            int second = ch[i + 1];

            int diff = Math.abs(first - second);
            number_buff.append(diff);

        }
        //appending the unit's digit
        number_buff.append(ch[(ch.length) - 1]);
        //First convert StringBuffer to String and then String to an integer
        int new_num= Integer.parseInt(number_buff.toString());

        return (new_num);
    }

}

public class P2Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        ModifyNumberClass m = new ModifyNumberClass();
        System.out.println("OUTPUT: " + m.modifyNumber(num));

    }

}
