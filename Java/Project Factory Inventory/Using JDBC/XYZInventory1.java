package projectInverntoryDB;

import java.sql.*;
import java.util.*;
import javax.swing.*;

//Don't forget to add MySQL JDBC Driver to "Libraries" 
/**
 *
 * @author Prashanth
 * TITLE: Project Inventory Application (XYZInventory1.java)
 * Variables: ArrayList<> a1,a2,a3
 *            String status,url,username,pass,query1,query2,query3
 *            JFrame f
 *            JLabel label1,label2
 *            JTextArea area
 *            ResultSet rs1,rs2,rs3
 *            Iterator itr1,itr2,itr3
 *            double total_employee_cost, total_products_cost, total_sales_gain
 *            Employee1 e, Products1 p, Status1 s;
 * 

/*

/*mySQL Database Tables 

+ --------------- + ----------------- + ---------------- +
| EmployeeID      | EmployeeName      | EmployeeSal      |
+ --------------- + ----------------- + ---------------- +
| 1               | Adam              | 10000            |
| 2               | Peter             | 5000             |
| NULL            | NULL              | NULL             |
+ --------------- + ----------------- + ---------------- +

+ ----------- + -------------- +
| ProdID      | ProdPrice      |
+ ----------- + -------------- +
| 1           | 2000           |
| 2           | 5000           |
| NULL        | NULL           |
+ ----------- + -------------- +

+ ------------ + --------------- +
| SalesID      | SalesPrice      |
+ ------------ + --------------- +
| 1            | 5000            |
| 2            | 25000           |
| NULL         | NULL            |
+ ------------ + --------------- +


 */
public class XYZInventory1 {

    public static void main(String[] args) throws Exception {
        //Creating an array list of Employees    
        ArrayList<Employees1> a1 = new ArrayList<>();
        ArrayList<Products1> a2 = new ArrayList<>();
        ArrayList<Sales1> a3 = new ArrayList<>();

        JFrame f = new JFrame("XYZ Factory Inventory Application");
        //Creating & Adding a JLabel
        JLabel label1 = new JLabel("Accessing mySQL database...");
        label1.setBounds(50, 1, 200, 100);
        f.add(label1);

        //JDBC Loading Drivers, Establishing a connection, Creating a statement
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String pass = "root123";
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, pass);
        Statement st = con.createStatement();
        //Queries
        String query1 = "select * from employees";
        String query2 = "select * from products";
        String query3 = "select * from sales";

        //Reading from the employees table
        ResultSet rs1 = st.executeQuery(query1);
        while (rs1.next()) {

            Employees1 e = new Employees1();
            e.setEmployeeID(rs1.getInt(1));   //sets current Employee ID
            e.setEmployeeName(rs1.getString(2)); //sets current Employee Name
            e.setEmployeeSal(rs1.getDouble(3)); //sets current Employee Salary 
            e.setEmployeeCount();   //increments Employee Count N
            a1.add(e);

        }
        //Reading from the products table
        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {
            Products1 p = new Products1();
            p.setProdCount(); //increments product count
            p.setProdID(rs2.getInt(1)); //sets corrent Product ID
            p.setProdPrice(rs2.getDouble(2)); //sets current Product Price
            a2.add(p);//adds the current product object to the array list

        }
        //Reading from the sales table

        ResultSet rs3 = st.executeQuery(query3);

        while (rs3.next()) {
            Sales1 s = new Sales1(a2);
            //passing the arrayList of products as an arguement to the constructor
            s.setSalesCount(); //increments sales count
            s.setSalesPrice(rs3.getDouble(2)); //sets current Sales Price
            a3.add(s);//adds the current sales object to the array list

        }

        //Closing the resources
        st.close();
        con.close();

        //Profit or Loss Calculations...
        Iterator itr1 = a1.iterator();  //Iterator for Employees Array List
        Iterator itr2 = a2.iterator();  //Iterator for Products Array List
        Iterator itr3 = a3.iterator();  //Iterator for Sales Array List

        double total_employee_cost = 0, total_products_cost = 0, total_sales_gain = 0;
        while (itr1.hasNext()) {
            Employees1 temp = (Employees1) itr1.next();
            total_employee_cost = total_employee_cost + temp.getEmployeeSal();

        }
        while (itr2.hasNext()) {
            Products1 temp = (Products1) itr2.next();
            total_products_cost = total_products_cost + temp.getProdPrice();

        }
        while (itr3.hasNext()) {
            Sales1 temp = (Sales1) itr3.next();
            total_sales_gain = total_sales_gain + temp.getSalesPrice();

        }
        //Creating & Adding a JTextArea
        JTextArea area = new JTextArea("----------------INVENTORY REPORT----------------\n\n"
                + " Total Salary given to Employees: Rs." + total_employee_cost
                + "\nTotal cost for purchasing Products: Rs." + total_products_cost
                + "\nTotal Sales Amount gained: Rs." + total_sales_gain);
        area.setBounds(10, 70, 400, 100);
        f.add(area);

        String status;
        if (total_employee_cost + total_products_cost < total_sales_gain) {
            status = "PROFIT!";
        } else {
            status = "LOSS!";
        }

        //Creating & Adding a JLabel
        JLabel label2 = new JLabel("\nSTATUS REPORT for April 2017 is " + status);
        label2.setBounds(50, 150, 300, 100);
        f.add(label2);
        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
    }

}
