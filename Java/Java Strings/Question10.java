/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *TITLE: To convert an input string to a Keypad digits sequence 
 * Class: class PhoneKeyPad, public class Question2
 * Methods: char getKeyPadDigit(char)
 * Variables: char character, char ch, String s, int k
 * @author Prashanth
 */
class PhoneKeyPad {
    
    char getKeyPadDigit(char character)
    {
    switch(character){
        case 'a':
        case 'b':
        case 'c': return(2);
        case 'd':
        case 'e':
        case 'f': return(3);   
        case 'g':
        case 'h':
        case 'i': return(4);
        case 'j':
        case 'k':
        case 'l': return(5);
        case 'm':
        case 'n':
        case 'o': return(6);
        case 'p':
        case 'q':
        case 'r':
        case 's': return(7);
        case 't':
        case 'u':
        case 'v': return(8);
        case 'w':
        case 'x':
        case 'y':
        case 'z': return(9);
        default:  return(0); //0 stands for invalid characters
        
    
    }
    
    }
    
}

public class Question2{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PhoneKeyPad p=new PhoneKeyPad();
    System.out.println("Enter a string:");
    String s=sc.next().toLowerCase();  //converts the string to LowerCase
    System.out.println("In a phone keypad, you'll have to enter:  ");
    for(char ch:s.toCharArray()){
        int k=p.getKeyPadDigit(ch);
        System.out.println(ch+" -> "+k);
    
    }


}
        

}
