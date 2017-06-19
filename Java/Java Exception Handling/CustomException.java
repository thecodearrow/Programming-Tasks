
package Week8;

/**
 *
 * @author Prashanth
 */
public class CustomException {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BasicTryCatchDemo b = new BasicTryCatchDemo();
        b.tryCatchDemo();
    }

}

class BasicTryCatchDemo extends Exception {

    int a = 0;

    void tryCatchDemo() throws Exception {
        int x;

        try {
            int x1 = 2;
            if (a == 0) {
                throw new Exception1("Divide by zero custom message");
            }

        } catch (Exception1 e) {
            System.out.println(e);

        }

    }

}

class Exception1 extends Exception {

    Exception1(String message) {
        super(message);

    }

}

    
    
    
    
    
    
    
    

