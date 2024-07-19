//Write a Java program to get a number from the user and print whether it is positive or negative.

package com.lab1;

import java.util.Scanner;

public class Greater_Number {

	public static void main(String[] args) {
		//declare variables
		int num1, num2, num3;
		// System is predefined class
		//out is instace of PrintStream
		//println is a method of PrintStream
		System.out.println("Enter three integers: ");  
		//Scanner is a class
		//in is object of scanner class
		//new create object
		Scanner in = new Scanner(System.in);  
		num1=in.nextInt();  //Reads the next integer input by the user and assigns it to the variable num1
		num2=in.nextInt();  //Reads the next integer input by the user and assigns it to the variable num2
		num3=in.nextInt();  //Reads the next integer input by the user and assigns it to the variable num3
		if (num1 > num2 && num1 > num3)  // check the number
		System.out.println("The largest number is: "+num1);  
		else if (num2 > num1 && num2 > num3)  //// check the number
		System.out.println("The largest number is: "+num2);  
		else if (num3 > num1 && num3 > num2)  //// check the number
		System.out.println("The largest number is: "+num3);  
		else  
		System.out.println("The numbers are same.");  

	}

}
/*Dry Run
Enter three integers:
5
6
7
OUTPUT: The largest number is: 7*/
