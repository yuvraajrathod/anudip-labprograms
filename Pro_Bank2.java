// Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
package com.lab5;

import java.util.ArrayList;
import java.util.List;
//create an interface
interface Account 
{
    void deposit(double amount); // create method

    void withdraw(double amount); // create method

    void cal_Interest(); // For savings account only

    double getBalance();
}
// create class Svg_Acc and implements Account interface
class Svg_Acc implements Account
{
    // declare variable
    private double balance;
    private double interestRate;

    // create parameterised constructor 
    public Svg_Acc(double initialBalance, double interestRate)
    {
        this.balance = initialBalance; //this-> refer to current class
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void cal_Interest() {
        balance += balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

	
}
// create class Cur_Acc and implements Account Interface
class Cur_Acc implements Account 
{
    // declare variable
    private double balance;
    private double overdraftLimit;
    // create parameterised constructor
    public Cur_Acc(double initialBalance, double overdraftLimit)
    {
        // this-> refer to current class
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) // create method
    {
        if (amount <= balance + overdraftLimit) 
        {
            balance -= amount;
        } 
        else
        {
            System.out.println("Insufficient funds for withdrawal. Transaction exceeds overdraft limit.");
        }
    }

    @Override
    public void cal_Interest() {
        // Not applicable for current accounts
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
 class Bank 
 {
     // create list 
    private final List<Account> accounts;

    public Bank() // create method
    {
        this.accounts = new ArrayList<>(); // create object of ArrayList
    }

    public void addAccount(Account account) 
    {
        accounts.add(account);// add the method
    }

    public List<Account> getAccounts() 
    {
        return accounts;
    }
}
// main class
public class Pro_Bank2
{
    public static void main(String[] args) 
    {
        // create object 
        Bank bank = new Bank();

        bank.addAccount(new Svg_Acc(1000, 0.05));// pass the value
        bank.addAccount(new Cur_Acc(500, 1000));//pass the value

        // Simulate transactions
        bank.getAccounts().get(0).deposit(500);
        bank.getAccounts().get(0).withdraw(200);
        ((SavingsAccount) bank.getAccounts().get(0)).cal_Interest(); // Cast to access specific method

        bank.getAccounts().get(1).deposit(100);
        bank.getAccounts().get(1).withdraw(800);

        // Print account balances
        for (Account account : bank.getAccounts()) {
            System.out.println("Balance: $" + account.getBalance());
        }
    }
}