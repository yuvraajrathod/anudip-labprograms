//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
package com.Lab_3;
// create class Animal 
class  Animal
{
    // create move method()
	void move()
	{
	    // System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Animal Moving");
	}
}

// create class Cheetah extends with class Animal
class Cheetah extends  Animal
{
    // create move method()
	void move()
	{
		System.out.println("Cheeta Moving");
	}
}
// main class and its name is Animal
public class Animal1 
{

	public static void main(String[] args) 
	{
	    // create object of Animal class
		Animal a1 = new Animal();
		a1.move(); // call move() method
		Cheetah c1 = new Cheetah(); // create object of Cheetah Class 
		c1.move(); // call move() method
	}

}
/*Dry Run:
start from the main method
a1.move() call the method
Animal Moving
a1.move()  call the method
Cheeta Moving
*/
