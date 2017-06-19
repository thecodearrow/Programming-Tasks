/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

/**
 *
 * @author Prashanth
 * TITLE: To demonstrate the use of TRY,CATCH,THROW,THROWS,FINALLY 
 * CLASS: public class ExceptionHandling, class TryCatchThrowFinally
 * Methods: procA(),procB(),procC(),public static void main()
 */
class TryCatchThrowFinally {

    void procA() throws Exception {

        try {
            throw new Exception("Custom Message Exception");
            /*throws a custom message 
                                                    exception*/
        } finally {
            System.out.println("Finally ProcA");
        }

    }

    int procB() {
        try {
            return (1);
        } finally {
            System.out.println("Finally ProcB");/*finally will still be executed
                                                   even after specifying the 
                                                           return statement*/

        }
    }

    void procC() {
        try {
        } finally {
            System.out.println("Finally ProcC");
        }
    }

}

public class ExceptionHandling {

    public static void main(String[] args) {
        // TODO code application logic here

        TryCatchThrowFinally t = new TryCatchThrowFinally();
        try {

            t.procA();

        } catch (Exception e) { //catches the Exception thrown by procA()
            System.out.println(e);
        }
        t.procB();
        t.procC();

    }

}
