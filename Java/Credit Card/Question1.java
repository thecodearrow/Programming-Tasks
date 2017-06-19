
package week4.pkg5;

import static java.lang.Math.*;


/**
 *
 * @author Prashanth
 * TITLE: Project Question 1
 * Input: Balance,Monthly Interest Rate, Annual Interest Rate
 * Output: Minimum monthly payment, Remaining Balance (month wise), TotalPaid
 * Methods: main(), void display(),void finalDisplay()
 * Classes: public class Question1, class CCDebt
 */


class CCDebt {

    int count;
    double balance;
    double monthlyPaymentRate;
    double annualInterestRate;
    double updatedBalance;

    CCDebt(double bal, double annual_rate, double min_monthly_rate) {
        this.balance = bal;
        this.annualInterestRate = annual_rate;
        this.monthlyPaymentRate = min_monthly_rate;

    }

void display(){
     updatedBalance=balance;
    for(count=0;count<=12;count++){
    System.out.println("Month:"+count);
     double monthlyPayment=updatedBalance*monthlyPaymentRate;
     monthlyPayment=Math.round(monthlyPayment*100)/100.0; /*rounds off upto
                                                            2 decimal places*/
     
        System.out.println("Minimum monthly payment: "+monthlyPayment);
        double remBalance=updatedBalance-monthlyPayment;
        updatedBalance=remBalance+remBalance*(annualInterestRate/12);
        updatedBalance=round(updatedBalance*100)/100.0;/*rounds off upto
                                                        2 decimal places*/
        System.out.println("Remaining Balance: "+updatedBalance);
        System.out.println("\n");
    }
}
    
    void finalDisplay(){
    double total_paid=(balance-updatedBalance);
    total_paid=round(total_paid*100)/100.0;
    System.out.println("\nTotalPaid: "+total_paid);
        System.out.println("Remaining balance: "+updatedBalance);


}
}



public class Question1 {

   
    public static void main(String[] args) {
        
        CCDebt ccd=new CCDebt(5000,0.18,0.02);
        ccd.display();
        ccd.finalDisplay();
        
    }
    
}
