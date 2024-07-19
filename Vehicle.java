//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package com.Lab_3;
// create class and its name is Vehicle1
 class Vehicle1
{
	void drive() // create method and its name is drive() 
	{
	    // System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Repairing Vehicle");
	}
}
// create class and its name is Car this class extends Vehicle Class
class Car extends Vehicle
{
	void drive() // create method and its name is drive()
	{
		System.out.println("Repairing Car");
	}
}
// main class its name is Vehicle
public class Vehicle
{
	
	public static void main(String[] args) {
		Vehicle1 v1 = new Vehicle1();// create Vehicle1 class object v1
		// call the method by object name i.e. v1
		v1.drive();
		
		// create Car class object 
		Car c1 = new Car();
		c1.drive();// call method bt object name i.e. c1
		
	}

}
/*Dry Run:
start from the main method
v1.drive call the method
Repairing Vehicle
c1.drive call the method
Repairing Car*/
