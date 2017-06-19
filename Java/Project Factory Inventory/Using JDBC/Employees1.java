package projectInverntoryDB;
/**
 * TITLE: Factory Inventory Application (Employees1.java)
 * @author Prashanth
 * Class: public class Employees
 * 
 * Methods:
 *  void setEmployeeID(String), String getEmployeeID(), 
 *  void setEmployeeName(String), String getEmployeeName(),
 *  void setEmployeeSal(double),  double getEmployeeSal()
 *  void setEmployeeCount(), int getEmployeeCount()
 *  public String toString()
 * 
 * Variables:
 *      private String employee_ID;
        private String employee_name;
        private double employee_sal;
        private static int employee_count;
 */
public class Employees1 {

    private int employee_ID;
    private String employee_name;
    private double employee_sal;
    private static int employee_count=0; //employee count is made static
    
    //Getters & Setters
    void setEmployeeID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

   int getEmployeeID() {
        return employee_ID;
    }

    void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    String getEmployeeName() {
        return employee_name;
    }

    void setEmployeeSal(double employee_sal) {
        this.employee_sal = employee_sal;
    }

    double getEmployeeSal() {
        return employee_sal;
    }

    void setEmployeeCount() {
        employee_count++;
    }

    int getEmployeeCount() {
        return employee_count;
    }

    @Override
    public String toString() {
        return ("Employee ID:" + employee_ID + "\nEmployee Name:" + employee_name + "\nEmployee Salary: Rs." + employee_sal);

    }

}
