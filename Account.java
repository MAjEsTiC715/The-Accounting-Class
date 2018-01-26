//Documentation
/*
    Design a class named Account that contains:
     A private int data field named id for the account (default 0).
     A private double data field named balance for the account (default 0).
     A private double data field named annualInterestRate that stores the current
     interest rate (default 0). Assume all accounts have the same interest rate.
     A private Date data field named dateCreated that stores the date when the
     account was created.
     A no-arg constructor that creates a default account.
     A constructor that creates an account with the specified id and initial balance.
     The accessor and mutator methods for id, balance, and annualInterestRate.
     The accessor method for dateCreated.
     A method named getMonthlyInterestRate() that returns the monthly
     interest rate.
     A method named getMonthlyInterest() that returns the monthly interest.
     A method named withdraw that withdraws a specified amount from the
     account.
     A method named deposit that deposits a specified amount to the account.
    Write a test program that creates an Account object with an account ID of 1122,
    a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
    method to withdraw $2,500, use the deposit method to deposit $3,000, and print
    the balance, the monthly interest, and the date when this account was created
*/
public class Account {
	
	private int id = 0; // instance variable set to 0
    private double balance = 0.0; // instance variable set to 0
    private static double annualInterestRate = 0.0; // instance variable set to 0
    private java.util.Date dateCreated; // import the library Date to get the date

    // no arg constructor that creates a default account
    public Account() {
        dateCreated = new java.util.Date();
    }

    // a constructor that initiates id and balance with a parameter name
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
 // method to retrieve the id
    public int getId() {
        return this.id;
    }
 // method to retrieve the balance
    public double getBalance() {
        return this.balance;
    }
 // method to retrieve the annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
 // method to retrieve the dateCreated
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
 // method to set the id
    public void setId(int id) {
        this.id = id;
    }
    // method to set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // method to set the annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    // method to get the MonthlyInterestRate
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    // method to get the MonthlyInterestRate
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    // method to withdraw a certain amount
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    // method to deposit a certain amount
    public void deposit(double amount) {
        this.balance += amount;
    }
}
