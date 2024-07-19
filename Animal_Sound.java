//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
package com.Lab_3;
// create class AnimalN
class AnimalN
{
	void makesound() // create method makesound()
	{
	    // System is predefine class
		//out is instance of PrintStream
		//println is a method of PrintStream that print line of text
		System.out.println("Animal making Noise");
	}
}
// create class and its name is Cat extends with Animal class
class Cat extends Animal
{
	void makesound() // creae method name is makesound
	{
		System.out.println("The cate saying Meow");
	}
}
//main class
public class Animal_Sound
{

	public static void main(String[] args) 
	{
	    //create AnimalN class object  
		AnimalN a1 = new AnimalN();
		a1.makesound(); // call method by using AnimalN class object 
		// create object of Cat class
		Cat c1=new Cat();
		c1.makesound();// call method by using Cat class object
	}
}
/*Dry Run:
start from the main method
a1.makesound() call the method
Animal making Noise
c1.makesound()  call the method
The cate saying Meow*/
