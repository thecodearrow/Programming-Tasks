package accessspecifiers2;

import accesspecifiers.MainClassA;

/**
 *
 * @author Prashanth
 * TITLE: A Java Program to demonstrate Access Specifiers in same package and
 * other package in Java
 * LOGIC:  'Protected' variables outisde a package can be inherited only by
 *          child class.
 *         'Public' variables can be accessed both from all classes both within 
 *           and outside package. 
 *          Private' variables cannot be accessed outsdide a class. 
 *          Default variables cannot be accessed outside a class.
 * Class: class E, class D, public class MainClass
 * Methods: void display1(), void display()
 * 
 * 
 */
class E extends MainClassA {

    void display1() {
        System.out.println("Accessing variables of Class A from Class E "
                + "inherited(different package)...");
        //System.out.println("Default variable=" + var1);
        //Cannot access default outside package
        //System.out.println("Private variable="+var2); Cannot access private
        System.out.println("Public variable=" + var3);
        System.out.println("Protected variable=" + var4 + "\n");
        //Can access protected outside package since E inherits A

    }

}

class D {

    MainClassA ob = new MainClassA();

    void display() {
        System.out.println("Accessing variables of Class A from Class D"
                + "(different package)...");
        //System.out.println("Default variable=" + ob.var1);
        // Cannot access default outside package
        //System.out.println("Private variable="+ob.var2); Cannot access private
        System.out.println("Public variable=" + ob.var3+"\n");
        //System.out.println("Protected variable=" + ob.var4 + "\n");
        //Cannot access protected.

    }

}

public class MainClass {

    public static void main(String args[]) {
        D d = new D();
        d.display();
        E e = new E();
        e.display1();

    }
}
