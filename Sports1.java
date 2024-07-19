//Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.
package com.Lab_4;
// create class and its name is Sports
class Sports
{
	public void play()// create method
	{
		System.out.println("Playing Sports");
	}
}
//create class FootBall extends with Sports
class FootBall extends Sports
{
	public void play()// cretae method
	{
		System.out.println("Playing FootBall");
	}
}
// create class BasketBall extends with Sports class
class BasketBall extends Sports
{
	public void play()// create method
	{
		System.out.println("Playing BasketBall");
	}
}
// create class Rugby extends with Soprts class
class Rugby extends Sports
{
	public void play()// cretae method
	{
		System.out.println("Playing Rugby");
	}
}
// main class
public class Sports1 
{

	public static void main(String[] args) 
	{
	    // create object of Sports class
		Sports sp= new Sports();
		// create object of FootBall class
		FootBall fb = new FootBall();
		// create object of BasketBall class
		BasketBall bb = new BasketBall();
	// create object of Rugby class
		Rugby rb= new Rugby();
		
		sp.play();// method call
		fb.play();// method call
		bb.play();// method call
		rb.play();// method call
	}

}
/*Dry Run
sp.play();// method call
Playing Sports

fb.play();// method call
Playing FootBall

bb.play();// method call
Playing BasketBall

rb.play();// method call
Playing Rugby		
*/
