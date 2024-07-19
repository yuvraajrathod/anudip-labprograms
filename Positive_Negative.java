//Write a Java program to get a number from the user and print whether it is positive or negative.
package com.lab1;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		// Scanner is class
		// sc is object of class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		// declare variable
		int num1 =  sc.nextInt();//Reads the next integer input by the user and assigns it to the variable num1
		
		 if (num1 > 0) // check the condition
		 {
	            System.out.println("The number is positive.");
	        } 
		 else if (num1 < 0) // check the condition
		 {
	            System.out.println("The number is negative.");
	        }
		 else
		 {
	            System.out.println("The number is zero.");
	      }
		

	}

}
/*Dry Run
Enter Number:5
5>0
The number is positive.

Enter Number:-3
-3 > 0
The number is negative.

Enter Number:
0
The number is zero.

*/