//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.
package com.Lab_4;

import java.util.Scanner;
// create class and its name is Shape
class Shape
{
	public void draw() // create method
	{
		System.out.println("Draw shape");
	}
	
	public double Calculatearea() // create method and its name is Calculatearea
	{
		return 0.0;
		
	}
	
}
// create class Circle extends with class shape
class Circle extends Shape
{
    // variable declare
	private double r;
	// create parametrised constructor
	public Circle(double r)
	{
	    // this-> refer to current class
		this.r=r;
	}
	
	public void draw()
	{
		System.out.println("Draw Circle");
	}
	
	public  double Calculatearea() // create method
	{
		return 3.14*r*r;
		
	}
	
}
// create class Square extends with Shape Class
class Square extends Shape
{
    // variable declare
	private double side;
	//create parameterised constructor
	public Square(double side)
	{
	    // this-> refer to current class
		this.side=side;
	}
	
	public void draw()//create method
	{
		System.out.println("Draw Square");
	}
	
	public double Calculatearea() // create method
	{
		return side * side;
		
	}
	
}
// create class Triangle extends with class Shape
class Triangle extends Shape
{
    // varible declare
	private double base,height;
	// create parameterised constructor
	public Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	
	public void draw()// create method
	{
		System.out.println("Draw Triangle");
	}
	
	public double Calculatearea()// create method
	{
		return 05 * base * height;
		
	}
	
}
// main class
public class Shape1
{

	public static void main(String[] args) 
	{
	    // Scanner is predefied class
	    // sc is object of Scanner class
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Radius of Circle:");
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		System.out.println("Area of Circle is:"+c.Calculatearea());
		
		System.out.println("Enter Side of the square:");
		double side = sc.nextDouble();
		Square sq = new Square(side);
		System.out.println("Area of Square is:"+sq.Calculatearea());
		
		System.out.println("Enter base of the triangle:");
		double base = sc.nextDouble();
		System.out.println("Enter height of the triangle:");
		double height = sc.nextDouble();
		Triangle tr  = new Triangle(base,height);
		System.out.println("Area of Square is:"+tr.Calculatearea());
	}

}

/*Dry Run
Enter Radius of Circle:
5
Area of Circle is:78.5
Enter Side of the square:
6
Area of Square is:36.0
Enter base of the triangle:
9
Enter height of the triangle:
12
Area of Square is:540.0
*/