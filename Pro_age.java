//Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.
package com.exception_handling;

// A class to demonstrate exception handling for age validation
public class Pro_age {
    // Method to validate age
    void validate(int age) throws ArithmeticException {
        // Check if age is less than 18
        if (age < 18)
            // Throw ArithmeticException if age is not valid
            throw new ArithmeticException("Age is not valid");
        else
            // Print message if age is valid
            System.out.println("You are eligible for voting");
    }

    // Main method to test age validation
    public static void main(String[] args) {
        // Create an instance of Pro_age class
        Pro_age td = new Pro_age();
        try {
            // Test age validation with an age of 23
            td.validate(23);
        } catch (ArithmeticException ae) {
            // Handle ArithmeticException if thrown
            System.out.println("Welcome for Voting");
        }
        // Uncommenting the below line will result in compilation error because it's unreachable code
        // System.out.println("It will be executed");
    }
}
/*Dry Run

You are eligible for voting


*/