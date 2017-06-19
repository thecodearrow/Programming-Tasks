
package week10;



/**
 *
 * @author Prashanth 
 * TITLE: To demonstrate Enumerations
 * Class: public class EnumDemo
 * LOGIC: Enum can have its own constructor and can be used in switch cases! 
 */
enum Apple {
    Jonathan(12), GoldenDel(13), RedDel(14), Winesap(16), Cortland(89); //enum contents
    int price;

    Apple(int x) {
        price = x;
    }

}

public class EnumDemo {

    public static void main(String args[]) {

        System.out.println("Using values() function and for each loop....");
        System.out.println("Contents of Apple: ");
        for (Apple a1 : Apple.values())//demonstrating for each loop and values()
        {
            System.out.println(a1 + " " + a1.price);
        }

        System.out.println("Using switch...."); //demonstrating switch()
        Apple a2 = Apple.valueOf("GoldenDel");

        switch (a2) {
            case Jonathan: {
                System.out.println("Selected apple is: Jonathan");
                break;
            }
            case GoldenDel: {
                System.out.println("Selected apple is: GoldenDel");
                break;
            }
            case RedDel: {
                System.out.println("Selected apple is: RedDel");
                break;
            }
            case Winesap: {
                System.out.println("Selected apple is: Winesap");
                break;
            }
            case Cortland: {
                System.out.println("Selected apple is: Cortland");
                break;
            }
            default: {
                System.out.println("Invalid entry! Apple not found!!");
            }
        }
        

    }
}
