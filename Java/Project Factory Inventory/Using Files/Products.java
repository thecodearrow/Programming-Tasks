package projectinventoryFiles;

/**
 *
 * @author Prashanth 
 * TITLE: Factory Inventory Application (Products.java)
 * Class: public class Products
 * Methods: public String toString()
 *          void setProdID(String), String getProdID()
 *          void setProdCount(), int getProdCount()
 *          void setProdPrice(double),  double getProdPrice()
 *          
 * Variables: private String prod_ID;
              private static int prod_count;  
              private double prod_price;
 * 
 *
 */
public class Products {

    private String prod_ID;
    private static int prod_count;  //product count is made static
    private double prod_price;

    //Getters & Setters

    void setProdID(String prod_ID) {
        this.prod_ID = prod_ID;
    }

    String getProdID() {
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
