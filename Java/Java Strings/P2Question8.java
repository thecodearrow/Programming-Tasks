
package week6;

import java.util.*;

/**
 *
 * @author Prashanth
 * TITLE: Secret Code Validator!
 * Class: class SecretCodeValidator, public class P2Question8
 * Methods: Boolean validateCode(String )
 * Variables:  char[] ch, int strlen
 *             Boolean bool,b,starts_with, contain_digits, 
 *             Boolean contain_alphanum, upper_lower;
 */
class SecretCodeValidator {

    Boolean validateCode(String code) {
        char[] ch = code.toCharArray();
        int strlen = code.length(), upper = 0, lower = 0;
        Boolean starts_with = code.toLowerCase().startsWith("cod");
        Boolean contain_digits = false; //set to false by default
        Boolean first_upper = Character.isUpperCase(code.charAt(0));
        //Code to check for digits
        for (char i : ch) {
            if (Character.isDigit(i)) {
                contain_digits = true;
                break;

            }

        }
        Boolean contain_alphanum = true; //set to true by default
        //Code to check for digits/alphabets only
        for (char i : ch) {
            if (!Character.isLetterOrDigit(i)) {
                contain_alphanum = false;
            }

        }

        //Code to count uppercase and lowercase letters
        for (char i : ch) {
            if (Character.isUpperCase(i)) {
                upper++;
            } else if (Character.isLowerCase(i)) {
                lower++;
            }

        }
        Boolean upper_lower;
        //Validates for upperCase > lowerCase characters
        if (upper > lower) {
            upper_lower = true;
        } else {
            upper_lower = false;
        }

        Boolean bool;
        //Validates for all six conditions
        if (strlen == 6 && starts_with == true && contain_digits == true
                && first_upper == true && contain_alphanum == true
                && upper_lower == true) {
            bool = true;
        } else {
            bool = false;
        }
        return (bool);
    }

}

public class P2Question8 {

    public static void main(String[] args) {

        SecretCodeValidator s = new SecretCodeValidator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your secret code:");
        String str = sc.next();
        Boolean b = s.validateCode(str);
        if (b == true) {
            System.out.println("Your secret code has been validated!");
        } else {
            System.out.println("Chosen secret code INVALID!");
        }

    }
}
