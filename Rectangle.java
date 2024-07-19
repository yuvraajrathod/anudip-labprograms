//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
package com.Lab_2_programs;

import java.util.Scanner;

//public class Rectangle
//{
//	double width;
//	double height;
//	
//	
////	public double getHeight()
////	{
////		return height;
////		
////	}
////	
////	public double getWidth()
////	{
////		return width;
////		
////	}
//	
//	public double calArea()
//	{
//		return width*height;
//	}
//	
//	public double calPerimeter()
//	{
//		return 2*(width+height);
//	}
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter Height:");
//		double height=sc.nextDouble();
//		
//		System.out.println("Enter Width:");
//		double width = sc.nextDouble();
//		
//		Rectangle r1 = new Rectangle();
//		
//		r1.calArea();
//		r1.calPerimeter();
//		
//		System.out.println("Area of Rectangle is:"+r1.calArea()+"Perimeter of Rectangle is:"+r1.calPerimeter());
//	}
//
//	
//}


// create a class and name is Rectangle
public class Rectangle
{
    // Declare variables 
	double height, width, area, peri;
	
	void calArea()// create method and its name is calArea()
	{
		area = height*width;
		// System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Area of rectangle is:"+area);
	}
	
	void calPerimeter() // create method and its name is calPerimeter()
	{
		peri = 2*(height + width);
		System.out.println("Perimeter of rectangle:"+peri);
	}
	
	public static void main(String args[])
	{
	    // Scanner is a predefined class for getting user input
	    //sc is object of scanner class
		Scanner sc = new Scanner(System.in);
		// System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Enter Height:");
		double height=sc.nextDouble();
		
		System.out.println("Enter Width:");
		double width = sc.nextDouble();
		// create object of className i.e. Rectangle Class
		Rectangle r1 = new Rectangle();
		r1.height = height;
		r1.width = width;
		r1.calArea();// call method calArea()
		r1.calPerimeter(); // call method calPerimeter
	}
}

/*Dry Run
OUTPUT:
Enter Height:
5.0
Enter Width:
3.0
Area of Rectangle is: 15.0
Perimeter of Rectangle is: 16.0
*/