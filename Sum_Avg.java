
//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
package com.lab1;

import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		// Scanner is class
		//input is object of scanner class
		  Scanner input = new Scanner(System.in);
		  // declare variable
	        int sum = 0;
	        int avg = 0;
	        // Syatem is predefine class
	        //out is instance of PrintStream
	        //pritln is a method of PrintStream
	        System.out.println("Input the 5 numbers: ");
	        //loop 
	        // declare variable 
	        // i<=5 condition
	        for(int i=1; i<=5; i++){
	            int num = input.nextInt();//Reads the next integer input by the user and assigns it to the variable num
	            sum +=  num;
	        }
	        System.out.println("The sum of the given number is " + sum);
	        avg = sum/5;
	        System.out.println("The average of the given number is " + avg);

	}

}
/*DRy Run
Input the 5 numbers: 
10
20
30
40
50
The sum of the given numbers is 150
The average of the given numbers is 30
*/