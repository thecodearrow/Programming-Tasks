package accesspecifiers;

/**
 *
 * @author Prashanth
 * TITLE: A Java Program to demonstrate Access Specifiers in same package 
 * and other package in Java
 * LOGIC:  'Protected' variables within a package behaves as public.
 *         'Public' variables can be accessed both from all classes both within 
 *           and outside package. 
 *          Private' variables cannot be accessed outsdide a class. 
 *          Default variables can be accessed within a package only.
 * Variables: (default)int var1, private int var2, public int var3, protected 
 * int var4
 * Methods: void display1(), void display()
 * Classes: public class MainClassA, class B, class C
 */
public class MainClassA {

    int var1 = 0; //default
    private int var2 = 1;
    public int var3 = 2;
    protected int var4 = 3;

    void display() {
        System.out.println("Accessing variables of Class A from Class A itself"
                + "(same package)...");
        System.out.println("Default variable=" + var1);
        System.out.println("Private variable=" + var2);
        System.out.println("Public variable=" + var3);
        System.out.println("Protected variable=" + var4 + "\n");

    }

    public static void main(String args[]) {

        MainClassA a = new MainClassA();
        a.display();
        B b = new B();
        b.display();
        C c = new C();
        c.display1();

    }

}

class B {

   MainClassA ob = new MainClassA();

    void display() {
        System.out.println("Accessing variables of Class A from Class B"
                + "(same package)...");
        System.out.println("Default variable=" + ob.var1);
        //System.out.println("Private variable="+ob.var2); Cannot access private
        System.out.println("Public variable=" + ob.var3);
        System.out.println("Protected variable=" + ob.var4 + "\n");
        //Protected inside package behaves as public

    }

}

class C extends MainClassA {

    void display1() {
        System.out.println("Accessing variables of Class A from Class C "
                + "inherited(same package)...");
        System.out.println("Default variable=" + var1);
        //System.out.println("Private variable="+var2); Cannot access private
        System.out.println("Public variable=" + var3);
        System.out.println("Protected variable=" + var4);

    }

}
