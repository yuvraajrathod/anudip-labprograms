//Write a Java program to display the first 10 natural numbers.
package com.lab1;

public class Natural_number {

	public static void main(String[] args) {
		//System is predefine class
		//out is object of PrintStream
		//println is a method of PrintStream
		System.out.println("The first 10 natural numbers are:");
      // for it is loop
      // int i intialize the variable
      // i<=10 condition
      //i++ increment
      for (int i = 1; i <= 10; i++) {
          System.out.println(i);
      }
	}

}
/*OutPut:
The first 10 natural numbers are:
1
2
3
4
5
6
7
8
9
10
*/