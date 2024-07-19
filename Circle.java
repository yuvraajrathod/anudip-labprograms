//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
package com.Lab_2_programs;

import java.util.Scanner;
// create class and its name is Circle
public class Circle 
{
    // declare variables
	double r,area,circ;
	
	void calArea()// create method and name is calArea()
	{
		area =3.14*r*r;
		// System is predefine class 
		//out is instance of PrintStream 
		//println is a method of PrintStream that print line of text
		System.out.println("Area of Circle is:"+area); // print the area of circle
	}
	
	void calCirc()// create method and its name is calCirc()
	{
		circ= 2*3.14*r;
		// System is predefine class 
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Circumference of circle:"+circ); // print circumference of circle
	}
	public static void main(String[] args)
	{
	    // Scanner is predefined class
	    // sc is the object of Scanner Class
		Scanner sc = new Scanner(System.in);
		// System is predefine class 
		//out is instance of PrintStream 
		//println is a method of PrintStream that print line of text
		System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        // create object of className i.e. Circle
        Circle c1= new Circle();
        c1.r=r;
        c1.calArea();// call the method by using calArea()
        c1.calCirc();   // call the method by using calCirc    		
	}

}
/*Dry Run
OUTPUT:
Enter the radius of the circle:5
3.14*5*
Area of Circle is: 78.5
2*3.14*5
Circumference of Circle is: 31.400000000000002
*/