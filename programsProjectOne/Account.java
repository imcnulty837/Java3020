//Ian McNulty 3/2/2020 Project One Problem 2
import java.util.Date;

public class Account {
    // Data Fields
    private int id; // Id for user
    private double balance, annualInterestRate; // Account balance / Annual Interest rate of account
    private Date dateCreated; // Date of account creation

    // No-Arg with default values
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Constructor with id and balance given
    public Account(int a, double b){
        id = a;
        balance = b;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Main
    public static void main(String[] args) {
        
    }

    // Withdraw and deposit methods
    public void withdraw(double a){
        setBalance(a*-1);
    }
    public void deposit(double a){
        setBalance(a);
    }

    // Secondary interest rate methods
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    // Accessor method bank
    public int getId(){ return id; }
    public double getBalance(){ return balance; }
    public double getAnnualInterestRate(){ return annualInterestRate; }
    public Date getDate(){ return dateCreated; }

    // Mutator method bank
    public void setId(int a){ id = a; }
    public void setBalance(double a){ balance += a; }
    public void setAnnualInterestRate(double a){ annualInterestRate = a; }
}

