/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Prashanth
 */
public class BankFixedDeposit {

    private double deposit;
    private PersonalDetails person;
    private float interest_rate;
    private double interest;
    private double period;

    public BankFixedDeposit(double deposit, double period, float interest_rate) {
        this.deposit = deposit;
        this.person = person;
        this.interest_rate = interest_rate;
        this.period = period;
    }

    public BankFixedDeposit(double period, float interest_rate) {
        this.person = person;
        this.interest_rate = interest_rate;
        this.period = period;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public PersonalDetails getPerson() {
        return person;
    }

    public void setPerson(PersonalDetails person) {
        this.person = person;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getInterest() {
        return interest;
    }

    public void calculateInterest(BankAccount account) {
        interest = deposit * period * (interest_rate / 100);
        account.credit(interest);

    }
}
