/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectInverntoryDB;

/**
 *
 * @author Prashanth
 */
import java.util.*;
/**
 * TITLE: Factory Inventory Application (Sales1.java)
 * @author Prashanth
 * Class: public class Sales
 * Methods: void setSalesCount(), int getSalesCount(), 
 *          void setSalesPrice(double), double getSalesPrice(),
 *          public String toString()
 * Variables: private static int sales_count;
 *            private double sales_price;
 */
public class Sales1  {
    private ArrayList<Products1> p=new ArrayList<>();
    private static int sales_count; //sales count is made static 
    private double sales_price;
 
    //The sales of products depends on the products available in the inventory
    Sales1(ArrayList<Products1> p){
    this.p=p;     //Getting the array list of Products objects created
    
    }
//Getters & Setters
    void setSalesCount() {
        sales_count++;
    }

    int getSalesCount() {
        return sales_count;
    }


    void setSalesPrice(double sales_price) {
        this.sales_price =sales_price;
    }

    double getSalesPrice() {
        return sales_price;
    }
    
    @Override
    public String toString(){
    
    return("Sales Price:Rs. "+sales_price);
    }

    
}
