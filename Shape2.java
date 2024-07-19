//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.
package com.Lab_4;
//create class Shape
class Shapee
{
	public void draw() // create method 
	{
		System.out.println("Draw Shape");
	}
	
	public double calculateArea()// create method 
	{
		return 0.0;
	}
}
// create class Ciclee extends with Shapee
class Circlee extends Shapee
{
    // declare variable
	private double r;
	// create parametrised constructor
	public Circlee(double r)
	{
		this.r= r;
	}
	
	public void draw()// create method 
	{
		System.out.println("Draw Circle");
	}
	
	public double calculateArea()// create method 
	{
		return 3.14 * r *r;
	}
}
// create class Cylinder extends with Shapee
class Cylinder extends Shapee
{
    // variable declare
	private double ht,r;
	// create paremeterised constructor
	public Cylinder(double r, double ht)
	{
		this.r=r;
		this.ht= ht;
	}
	
	public void draw()// create method 
	{
		System.out.println("Draw Cylinder");
	}
	
	public double calculateArea()// create method 
	{
		return (2*3.14*r*ht)+(2*3.14*r*r);
	}
}
// main class
public class Shape2
{

	public static void main(String[] args)
	{
	    // create object of Circlee class
		Circlee c= new Circlee(5);
		c.draw();// claaa method
		System.out.println("Area of Circle:"+c.calculateArea());
		 // create object of Cylinder class
		Cylinder cy = new Cylinder(3,7);
		cy.draw();//call method
		System.out.println("Area of cylinder:"+cy.calculateArea());
	}

}/*Dry Run
Draw Circle
Area of Circle:78.5
Draw Cylinder
Area of cylinder:188.39999999999998*/
