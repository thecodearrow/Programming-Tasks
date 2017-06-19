/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Prashanth
 * TITLE: Bank Application (InsufficientFundsException.java)
 * Constructor: InfufficientFundsException(String)
 * 
 */
public class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
    super(message);
    }
    
}
