//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
package com.Lab_4;
// create class BankAccount
class  BankAccount
{
    // declare variables
	String AccountNumber;
	double balance;
	// create parameterised constructor
	BankAccount(String AccountNumber, double balance)
	{
	    //this->refer to current clss
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	
	public double getBalance()// create method
	{
		return balance;
	}
	
	public void deposit(double amt)// cretae method
	{
		balance = balance + amt;
	}
	
	public void withdraw(double amt)//create method
	{
		if(amt <= balance)// check amount
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
// create class SavingsAcoount which inherites from BankAccount
class SavingsAcoount extends BankAccount
{
    // declare variable
	double withdrawalLimit;
	// create parametrised constructor
	SavingsAcoount(String AccountNumber, double balance, double withdrawalLimit)
	{
	    // super-> refer to parent class
		super(AccountNumber, balance);
		// this-> refer to current class
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= withdrawalLimit)// check amount
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Withdrawal limit exceeded");
		}
	}
	
}
// create class CheckingAcoount extends with BankAccount
class CheckingAcoount extends BankAccount
{
    // declare variable
	double overdraftFee;
    // create constructor and pass the value
	CheckingAcoount(String AccountNumber, double balance, double overdraftFee) {
		super(AccountNumber, balance);
		this.overdraftFee = overdraftFee;
	}
	
	public void withdraw(double amt)// cretae method
	{
		if(amt <= getBalance())
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Overdraft fee applied.");
		    super.withdraw(amt + overdraftFee);
		}
	}	
}
// main class
public class bank1 {

	public static void main(String[] args) {
		// create object of SavingsAcoount and pass the value
		SavingsAcoount sa = new SavingsAcoount("sa-8711", 5000, 1000);
		sa.withdraw(800);// call method
		System.out.println("Account Number: " +sa.AccountNumber+ ", Savings Account Balance: " +sa.getBalance());
			// create object of CheckingAcoount  and pass the value
		CheckingAcoount ca = new CheckingAcoount("ca-2211",2000, 100);
		ca.withdraw(200);//call method
		System.out.println("Account Number: " +ca.AccountNumber+ ", Checking Account Balance: " +ca.getBalance());
		
	}

}
/*Dry Run
sa.withdraw(800);// call method
Account Number: sa-8711, Savings Account Balance: 4200.0

	ca.withdraw(200);//call method
Account Number: ca-2211, Checking Account Balance: 1800.0*/