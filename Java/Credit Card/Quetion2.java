package week4.pkg5;



/**
 *
 * @author Prashanth 
 * TITLE: Project Question 2 
 * LOGIC: Increment monthly payment by 10 till updated balance <= 0
 * Input: Balance, Annual Interest Rate
 * Output: Lowest monthly payment
 * Methods: main(), void compute(), double checkUpdatedBalance()
 * Classes: class Question2, class CCDebt2
 */
class CCDebt2 {

    int count;
    double balance;
    double annualInterestRate;
    double updatedBalance;
    int minMonthlyPayment;

    CCDebt2(double bal, double annual_rate) {
        this.balance = bal;
        this.annualInterestRate = annual_rate;
        this.minMonthlyPayment = 0;

    }

    void compute() {
        

        while (checkUpdatedBalance() > 0) {
              
       minMonthlyPayment = minMonthlyPayment + 10; 
     
        }

    }

    double checkUpdatedBalance() {
        updatedBalance = balance; 
        
        for (int i = 1; i <= 12; i++) {

            double remBalance = updatedBalance - minMonthlyPayment;
            updatedBalance = remBalance + remBalance * (annualInterestRate / 12);
            updatedBalance = Math.round(updatedBalance * 100) / 100.0;
            /*rounds off upto 2 decimal places*/
            
        }
        
        if(updatedBalance<=0)
                System.out.println("Lowest Monthly Payment: "+minMonthlyPayment);
        
        return (updatedBalance);
        

    }
}

public class Quetion2 {

    public static void main(String args[]) {
        
        CCDebt2 ccd=new CCDebt2(4773,0.2);
        ccd.compute();

    }

}
