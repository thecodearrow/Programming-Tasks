
/**
 * TITLE: Factory Inventory Application (XYZInventory.java)
 * @author Prashanth
 * Class: public class XYZInventory
 * Methods: public static void main(String[])
 * Variables: ArrayList<> a1,a2,a3;
 *            FileInputStream f1,f2,f3
 *            Scanner sc1,sc2,sc3
 *            Iterator itr1,itr2,itr3
 *            double total_employee_cost, total_products_cost, total_sales_gain;
 *            String status;
 *            Employee e, Products p, Status s;
 */

//Required Imports

package projectinventoryFiles;

import java.util.*;

import java.io.*;

  /*
    List of Files Used

    Employees.txt           
    
    #XYZ001 Adam 100000
    #XYZ002 Ramesh 20000
    #XYZ003 Angela 5000
    
             */

/*
    Products.txt
                
    #Prod001 5000
    #Prod002 10000           
    #Prod003 50000 
    
             */

/*
    Sales.txt
                
    10000
    20000
    100000

             */



public class XYZInventory {

    public static void main(String[] args) throws IOException {
        System.out.println("XYZ Factory Inventory Application");
        //Creating an array list of Employees    
        ArrayList<Employees> a1 = new ArrayList<>();
        ArrayList<Products> a2 = new ArrayList<>();
        ArrayList<Sales> a3 = new ArrayList<>();
        

        try {
            FileInputStream f1 = new FileInputStream("Files/Employees.txt");
          
            Scanner sc1 = new Scanner(f1);
            while (sc1.hasNext()) {
                Employees e = new Employees();
                e.setEmployeeID(sc1.next());   //sets current Employee ID
                e.setEmployeeName(sc1.next()); //sets current Employee Name
                e.setEmployeeSal(sc1.nextDouble()); //sets current Employee Salary 
                e.setEmployeeCount();   //increments Employee Count N
                a1.add(e); //adds the current empoyee object to the array list
            }
            f1.close();
            FileInputStream f2 = new FileInputStream("Files/Products.txt");
            

            Scanner sc2 = new Scanner(f2);
            while (sc2.hasNext()) {
                Products p = new Products();
                p.setProdCount(); //increments product count
                p.setProdID(sc2.next()); //sets corrent Product ID
                p.setProdPrice(sc2.nextDouble()); //sets current Product Price
                a2.add(p);//adds the current product object to the array list

            }
            f2.close();
            FileInputStream f3 = new FileInputStream("Files/Sales.txt");
            
            Scanner sc3 = new Scanner(f3);
            while (sc3.hasNext()) {
                Sales s = new Sales(a2); 
        //passing the arrayList of products as an arguement to the constructor
                s.setSalesCount(); //increments sales count
                s.setSalesPrice(sc3.nextDouble()); //sets current Sales Price
                a3.add(s);//adds the current sales object to the array list

            }
            f3.close();

        } catch (FileNotFoundException e) {

            System.out.println(e);
        }

        //Profit or Loss Calculations...
        Iterator itr1 = a1.iterator();  //Iterator for Employees Array List
        Iterator itr2 = a2.iterator();  //Iterator for Products Array List
        Iterator itr3 = a3.iterator();  //Iterator for Sales Array List

        double total_employee_cost = 0, total_products_cost = 0, total_sales_gain = 0;
        while (itr1.hasNext()) {
            Employees temp = (Employees) itr1.next();
            total_employee_cost = total_employee_cost + temp.getEmployeeSal();

        }
        while (itr2.hasNext()) {
            Products temp = (Products) itr2.next();
            total_products_cost = total_products_cost + temp.getProdPrice();

        }
        while (itr3.hasNext()) {
            Sales temp = (Sales) itr3.next();
            total_sales_gain = total_sales_gain + temp.getSalesPrice();

        }

        String status;
        System.out.println("\n----------------INVENTORY REPORT----------------\n");
        System.out.println("Total Salary given to Employees: Rs." + total_employee_cost);
        System.out.println("Total cost for purchasing Products: Rs." + total_products_cost);
        System.out.println("Total Sales Amount gained: Rs." + total_sales_gain);

        if (total_employee_cost + total_products_cost < total_sales_gain) {
            status = "PROFIT!";
        } else {
            status = "LOSS!";
        }

        System.out.println("\nSTATUS REPORT for April 2017 is " + status);

    }
}
