//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package com.Lab_2_programs;

import java.util.Scanner;
// create a class and name is Person
public class Person
{
    // declare variable 
	static String name;
	static int age;
	
//	public void display(String name, int age)
//	{
//		System.out.println("Enter Name:"+name);
//		System.out.println("Enter Age:"+age);
//	}
	
	public  String getName() // create method and name is getName()
	{
		return name;
	}
	
	public int getAge()// create method and the name is getArea()
	{
		return age;
	}
	public static void main(String[] args)
	{
	    // Scanner is a predefined class
	    // sc is object of predefined class
		Scanner sc = new Scanner(System.in);
		//take input name from the user
		System.out.println("Enter Name:");
		name = sc.nextLine();// consume new line character
		//take input age from the user
		System.out.println("Enter Age:");
		age=sc.nextInt(); //Reads the next integer input by the user and assigns it to the variable num1
		
		// create the object of classname i.e. Person
		Person p1 = new Person();
		 // Print the name and age using the getter methods
		System.out.println("Name :"+p1.getName()+", Age : "+p1.getAge());
		
	}

}
/*
Dry Run
Enter Name:
Nivedita Sonkawade
Enter Age:
22
Name: Nivedita Sonkawade, Age: 22
*/
