//Write a Java program to get a number from the user and print cube of the number.

package com.lab1;

import java.util.Scanner;

public class Cube_Numbers {

	public static void main(String[] args) {
	    
		// System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
	      System.out.println("Enter a number :");
	      //Scanner is a class
	      //sc is object of scanner class
	      Scanner sc = new Scanner(System.in);
	      //num instance 
	      //nextInt()= is a method call that read the next integer from the input 
	      int num = sc.nextInt();
	      
	      System.out.println("Cube of the given number is "+(num*num*num));
	}

}

/*Dry Run
Enter a Number: 5
5*5*5
print:125

*/