// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
package com.lab5;
//create abstract class and its name is BankAccount
 abstract class BankAccount
 {
     // declare variable
    protected double balance;
    // crete constructor and pass value
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance; // this-> refer  to current class
    }

    public abstract void deposit(double amount); // create abstract method

    public abstract void withdraw(double amount); // create abstract method

    public double getBalance()  // create method
    {
        return balance;
    }
}
// create class SavingsAccount extends with BankAccount
class SavingsAccount extends BankAccount
{
    //declare variable
    private double interestRate;
    
    // create parameterised constructor and pass the value 
    public SavingsAccount(double initialBalance, double interestRate)
    {
        super(initialBalance); //super-> refer parent class
        this.interestRate = interestRate; // this->refer to current class
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } else 
        {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

	public void cal_Interest()
	{
		// TODO Auto-generated method stub
		
	}
}
// create class CurrentAccount extends with BankAccount
class CurrentAccount extends BankAccount
{
    //declare variable
    private double overdraftLimit;
    //create parametrised constructor and pass the value
    
    public CurrentAccount(double initialBalance, double overdraftLimit)
    {
        super(initialBalance); //super->refer to parent class
        this.overdraftLimit = overdraftLimit; // this->refer to current class
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount)// create method
    {
        if (amount <= balance + overdraftLimit) 
        {
            balance -= amount;
        } else
        {
            System.out.println("Insufficient funds for withdrawal. Transaction exceeds overdraft limit.");
        }
    }
}
//main class
public class Pro_Bank
{
    public static void main(String[] args) 
    {
        // create object of classes and pass the value
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        currentAccount.deposit(100);
        currentAccount.withdraw(800);

        System.out.println("Savings account balance: RS." + savingsAccount.getBalance());
        System.out.println("Current account balance: RS." + currentAccount.getBalance());
    }
}
/*Dry Run:
start the main method
create object and call the method
Savings account balance: RS.1300.0
Current account balance: RS.-200.0*/
