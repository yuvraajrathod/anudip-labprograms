package com.lab1;


import java.util.Scanner;

public class operators_using_switch_case {

	public static void main(String[] args) {
	// declare variable
		int a=10, b=20, c, choice;
		// Scanner is predefine class
		// sc object of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		//System is predefine class
		//out object of PrintStream 
		//println is method of PrintStream
			System.out.println("Enter Your Choice:");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Mulitiplication");
			System.out.println("3. Division");
		
		choice=sc.nextInt();//Reads the next integer input by the user and assigns it to the variable 
		switch(choice)
		{
		case 1:
			c=a+b;//add
			System.out.println("Addition is:"+c);
			break;//Exits the switch statement.
		case 2:
			c=a-b;//substract
			System.out.println("Substraction is:"+c);
			break;//Exits the switch statement.
		case 3:
			c=a*b;//multiplication
			System.out.println("Mulitiplication is:"+c);
			break;//Exits the switch statement.
		case 4:
			c=a/b;//division
			System.out.println("Division is:"+c);
			break;//Exits the switch statement.
		default:
			System.out.println("Invalid Choice");
		}
		

	}

}
/*dry run
Enter Your Choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
1
Addition is: 30

Enter Your Choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
2
Subtraction is: -10

Enter Your Choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
3
Multiplication is: 200

Enter Your Choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
4
Division is: 0

Enter Your Choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5
Invalid Choice

*/
