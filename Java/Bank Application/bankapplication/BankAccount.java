package bankapplication;

/**
 *
 * @author Prashanth
 * TITLE: Bank Application
 * Variables: private double balance(BankAccount.java)
 *            private int accno
 *            PersonalDetails person
 *            protected  int transactionCount
 *            private static int account_count
 * 
 * Constructors/Methods:public BankAccount(), public int getTransactionCount()
 *                      public PersonalDetails getPersonalDetails()
 *                      public void setPersonalDetails(PersonalDetails)
 *                      int getAccno(),public int getAccountCount()
 *                      public void credit(double),
 *                      public void debit(double ), public double getBalance()
 *                       
 *                       
 *                       
 */
public class BankAccount {

    private double balance; // instance variable that stores the balance
    private int accno;     //stores account number
    PersonalDetails person;
    protected  int transactionCount = 1; 
    private static int account_count = 1;
    //static int account_count,transaction count;
    // credit (add) an amount tothe account

    public BankAccount() {
        accno = 1000 + account_count++;
        balance = 0; //initially

    }
//Getters & Setters
    public PersonalDetails getPersonalDetails() {
        return person;
    }

    public void setPersonalDetails(PersonalDetails person) {
        this.person = person;
    }

    int getAccno() {
        return accno;
    }

    public void credit(double amount) {
        balance = balance + amount; // add amount to balance
        transactionCount++;
    } // end method credit

    //Exception Handling
    public void debit(double amount) {
        try{
        if ((balance - amount) >= 500) {
            balance = balance - amount; // debit amount from balance
        } else  {
            throw new InsufficientFundsException("Cannot be withdrawn. Sorry!");
        }
        }
        catch(InsufficientFundsException e)
        {System.err.println(e);}  
        
        transactionCount++;
    } // end method debit
    // return the account balance

    public double getBalance() {
        return balance; // gives thevalue of balancetothe calling method
    } // end method getBalance

    public int getTransactionCount() {
        return transactionCount;
    }
    
    public int getAccountCount(){
    return account_count;
    }

}
