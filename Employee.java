//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
package com.Lab_4;
// create class Employee1
class Employee1
{
    // declare variables
	private String name;
	private String role;
	
	// create parametrised constructor
	public Employee1(String name,String role)
	{
	    // this-> refer to current class
		this.name=name;
		this.role=role;
	}
	
	public String getName() // create method
	{
		return name;
	}
	
	public String getRole()// create method
	{
		return role;
	}
	
	public double calculateSalary() // create method
	{
		return 0.0;
	}
}
// create class Manager extends with Employee1
class Manager extends Employee1
{
    // declare variables
	private double sal;
	//create parametrised constructor
	public Manager(String name, double sal)
	{
	    // super->refer to parent class
	    // this->refer to current class
		super(name,"Manager");
		this.sal=sal;
		
	}
	
	public double calculateSalary() //create method 
	{
		return sal;
	}
}
// create class Programmer extends with Employee1
class Programmer extends Employee1
{
    // declare variables
	private double sal;
	//create parameterised constructor
	public Programmer(String name, double sal)
	{
	    // super->refer to parent class
	    // this-> refer to current class
		super(name,"Programmer");
		this.sal=sal;
	}
	
	public double calculateSalary() // create method
	{
		return sal;
	}
}
// main class
public class Employee
{

	public static void main(String[] args)
	{
	    // create object of Employee1
		Employee1 emp1 = new Manager("Nivedita",60000);// pass the parameters
		Employee1 emp2 = new Programmer("Harsh",60000);// pass the parameters
		// print the values
		System.out.println("Manager:"+emp1.getName()+"\n Role:" +emp1.getRole()+"\nSalary:RS."+emp1.calculateSalary());
		System.out.println("Programmer:"+emp2.getName()+"\n Role:" +emp2.getRole()+"\nSalary:RS."+emp2.calculateSalary());
	}
}
/*Dry Run:
starts from the main method
create constructor
create methods
create object and pass the parameter

Manager:Nivedita
 Role:Manager
Salary:RS.60000.0
Programmer:Harsh
 Role:Programmer
Salary:RS.60000.0*/
