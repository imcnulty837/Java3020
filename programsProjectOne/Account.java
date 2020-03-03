//Ian McNulty 3/2/2020 Project One Problem 2
import java.util.Scanner;
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

class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] list = {new Account(0, 100), new Account(1, 100), new Account(2, 100),
                          new Account(3, 100), new Account(4, 100), new Account(5, 100),
                          new Account(6, 100), new Account(7, 100), new Account(8, 100),
                          new Account(9, 100)};

        // Loop will never be broken
        while(true){
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            while(id >= 0 && id <= 9){
                // Main Menu
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                // Switch for menu options
                switch(choice){
                    case 1:
                        System.out.println("The balance is " + list[id].getBalance());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        list[id].withdraw(input.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        list[id].deposit(input.nextDouble());
                        break;
                    case 4:
                        id = 10;
                        break;
                }
            }
        }
    }
}