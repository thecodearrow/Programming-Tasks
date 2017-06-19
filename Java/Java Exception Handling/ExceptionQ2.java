/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

/**
 *
 * @author Prashanth
 * TITLE: To handle exceptions in Internal and External Marks
 * LOGIC: If internal_marks>30 & external_marks>70, throw an exception 
 * INPUT: internal and external marks
 * OUTPUT: Exception Message
 * Classes: class MarkCheck,class MarksException, public class Exception Q2
 * Methods: void verifyMarksAndDisplay() 
 * Variables: String message, int internal_marks,external_marks;
 *
 */
class MarksCheck {

    int internal_marks, external_marks;

    MarksCheck(int internal, int external) {
        this.internal_marks = internal;
        this.external_marks = external;

    }

    ;

    void verifyMarksAndDisplay() throws MarksException  {

        if (internal_marks > 30) {
            throw new MarksException("Internal mark exceeded");

        } else if (external_marks > 70) {

            throw new MarksException("External mark exceeded");
        } else {

            System.out.println("The Internal Marks are: " + internal_marks);
            System.out.println("The External Marks are: " + external_marks);
           

        }

    }

}

class MarksException extends Exception {

    MarksException(String message) {
        super(message);

    }

}

public class ExceptionQ2 {

    public static void main(String args[]) {

        MarksCheck m = new MarksCheck(30, 100);

        try {
           
            m.verifyMarksAndDisplay();
            
            
        } catch (MarksException e) {
            System.err.println(e);

        }
       
    }

}
