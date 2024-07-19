// Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
package com.lab8.demo;
// create class
public class Even_Odd 
{
	public static void main(String[] args)
	{
	     // Create a new thread for even numbers
		Thread event= new Thread(new EvenNumber());
		 // Create a new thread for odd numbers
		Thread oddt = new Thread(new OddNumber());
		// Start the thread for even numbers
		event.start();
		 // Start the thread for odd numbers
		oddt.start();
	}
}
// Runnable class to print even numbers
class EvenNumber implements Runnable
{

	@Override
	public void run()
	{
	     // Loop through even numbers from 2 to 20
		for(int i = 2; i<=20; i+=2)
		{
		    // Print the even number
			System.out.println(i + " is Even");
		}
		
	}
	
}
// Runnable class to print odd numbers
class OddNumber implements Runnable
{

	@Override
	public void run()
	{
	    // Loop through odd numbers from 1 to 19
		for(int i = 1; i<=20; i+=2)
		{
		    // Print the odd number
			System.out.println(i + " is Odd");
		}
		
	}
	
}
/*Dry Run
for(int i = 2; i<=20; i+=2)
2 is Even
4 is Even
6 is Even
8 is Even
10 is Even
12 is Even
14 is Even
16 is Even
18 is Even
20 is Even

for(int i = 1; i<=20; i+=2)
1 is Odd
3 is Odd
5 is Odd
7 is Odd
9 is Odd
11 is Odd
13 is Odd
15 is Odd
17 is Odd
19 is Odd
*/