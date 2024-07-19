// Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type
package com.lab5;
// create abstract class
abstract class Vehicle
{
    // create abstrct methods name is startEngine() and stopEngine
	 abstract void startEngine();
	 abstract void stopEngine();
}
// create class Car and extends with Vehicle class
class Car extends Vehicle
{
	

	@Override
	void startEngine() 
	{
		System.out.println("Car : Starts the Engie");
	}

	@Override
	void stopEngine()
	{
		System.out.println("Car: Stop the Engine" );
	}
}
// create MotorCycle class extends with Vehicle Class
class MotorCycle extends Vehicle
{

	@Override
	void startEngine()
	{
		System.out.println("Motorcycle : Start the Engine");
	}

	@Override
	void stopEngine()
	{
		System.out.println("Motorcycle : Stop the Engine");
	}
	
}
// main class
public class Program1 
{

	public static void main(String[] args)
	{
	   
	    Vehicle car = new Car(); // create an instance of Car, reference as Vehicle
        Vehicle motor = new MotorCycle(); // create an instance of MotorCycle, reference as Vehicle

        car.startEngine(); // call startEngine method on car
        car.stopEngine(); // call stopEngine method on car

        motor.startEngine(); // call startEngine method on motor
        motor.stopEngine(); // call stopEngine method on motor
	}

}
/*Dry Run:
start the main method 
Vehicle car = new Car()  create object
car.startEngine()  call startEngine method on car
car.stopEngine() call method
Car : Starts the Engie
Car: Stop the Engine

Vehicle motor = new MotorCycle()
motor.startEngine() // call startEngine method on motor
motor.stopEngine() call method
Motorcycle : Start the Engine
Motorcycle : Stop the Engine*/
