//Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.


package com.lab8.demo;
// Bank account class with concurrent deposits and withdrawals using threads
public class Account extends Thread
	{
	    // Shared balance among accounts
		static int balance = 1000;
		// Method to run the thread
		public void run()
		{
		    // Synchronize to ensure thread safety
			synchronized (Account.class)
			{
			     // Check if the balance is more than 800 for withdrawal
				if(balance>800)
				 // Print account details and allow withdrawal
			{
				System.out.println(Thread.currentThread().getName() + " Your balance is " + balance + " " + "rs you can withdraw the amount");
				
				try 
				{
				    // Simulate withdrawal process
					sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				balance=200;
				// Withdraw amount and update balance
				System.out.println(Thread.currentThread().getName() + " After withdrawal your balnce is " + "balance is " +balance );
			}
			else
			{
			    // Print account details and disallow withdrawal
				System.out.println(Thread.currentThread().getName() + " Your balance is " + balance + "so you cant withdraw the amount");
			}
			}
			
		}
		 // Main class to test the bank account functionality
		public class AccountMain 
		{

			public static void main(String[] args) 
			{
			     // Create two instances of Account
				Account ac1 = new Account();
				ac1.setName("Nivedita");
				
				Account ac2 = new Account();
				ac2.setName("Akkii");
				
				 // Start both threads
				ac1.start();
				ac2.start();
			}

		}

		
	}

/*Dry Run
Nivedita Your balance is 1000 rs. You can withdraw the amount
Nivedita After withdrawal, your balance is 200
Akkii Your balance is 1000 rs. You can withdraw the amount
Akkii After withdrawal, your balance is 200
*/
