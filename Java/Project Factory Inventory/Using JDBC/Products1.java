
package projectInverntoryDB;

/**
 *
 * @author Prashanth 
 * TITLE: Factory Inventory Application (Products1.java)
 * Class: public class Products
 *  Methods: public String toString()
 *           void setProdID(int prod_ID), int getProdID()
 *           void setProdCount(), int getProdCount()
 *           void setProdPrice(double),  double getProdPrice()
 * Variables: private int prod_ID;
              private static int prod_count;  
              private double prod_price;
 * 
 *
 */
public class Products1 {

    private int prod_ID;
    private static int prod_count;  //product count is made static
    private double prod_price;
  
    //Getters & Setters

    void setProdID(int prod_ID) {
        this.prod_ID = prod_ID;
    }

    int getProdID() {
        return prod_ID;
    }

    void setProdCount() {
       prod_count++;
    }

    int getProdCount() {
        return prod_count;
    }

    void setProdPrice(double prod_price) {
        this.prod_price = prod_price;
    }

    double getProdPrice() {
        return prod_price;
    }
    
    @Override
    public String toString() {
        return ("Product ID:" + prod_ID + "\nProduct Price: Rs." + prod_price);

    }

}
