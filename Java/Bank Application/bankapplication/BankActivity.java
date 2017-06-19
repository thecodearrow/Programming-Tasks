package bankapplication;

import java.util.Scanner;

/**
 *
 * @author Prashanth
 * TITLE: BankApplication(BankActivity.java)
 * Classes: public class Address, public class BankAccount, 
 *          public class PersonalDetails, public class BankActivity, 
 *          public class InsufficientFunds
 */
public class BankActivity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Welcome to Wayne Banking Services.");

        System.out.println("\nPlease fill your details patiently...\n");
        PersonalDetails p1 = new PersonalDetails();

        System.out.print("Please enter your First Name: ");
        String fName = sc.next();
        System.out.print("\nPlease enter your Last Name: ");
        String lName = sc.next();
       
        System.out.print("\nPlease enter your age: ");
        int pAge = sc.nextInt();
        p1.setFirstName(fName);
        p1.setLastName(lName);
        p1.setAge(pAge);
        System.out.println("\nNow, enter your address.");
        System.out.print("\nDoorno: ");
        int doorno = sc.nextInt();
        System.out.print("\nSteet: ");
        String street = sc.next();
        System.out.print("\nPostal Code: ");
        int postal = sc.nextInt();
        System.out.print("\nCity: ");
        String city = sc.next();

        p1.setAddress(doorno, street, postal, city);

        System.out.println("\nVerifying details...");
        BankAccount ac1 = new BankAccount();

       
        ac1.setPersonalDetails(p1);
        System.out.println("Bank Account with Account Number "
                + ac1.getAccno() + " successfully created.");

        System.out.println("\nPlease deposit a minimum of Rs.500 to activate"
                + " services. Also, ensure this mimimum balance is available"
                + " at all times to continue enjoying our services. ");
        ac1.credit(500);
        System.out.println("Rs.500 has been credited credited. \n ");

        //Banking services 
        Boolean cont = true;
        while (cont == true) {
            System.out.println("Enter 1 for Account Summary, 2 to Check Balance,"
                    + " 3 to Deposit Cash, 4 to Withdraw Cash");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(ac1.person);
                    System.out.println("Account Balance: Rs." + ac1.getBalance());
                    break;
                case 2:
                    System.out.println("Account Balance: Rs." + ac1.getBalance());
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: Rs.");
                    double amt = sc.nextDouble();
                    ac1.credit(amt);
                    break;
                case 4:
                    System.out.print("Enter the amount to be withdrawn: Rs.");
                    amt = sc.nextDouble();
                    ac1.debit(amt);
                    break;

            }
            System.out.println("\n\nRepeat?[true/false]");
            cont = sc.nextBoolean();

        }
        System.out.println("\n\nThankyou for using Wayne Banking Services.");

    }

}
