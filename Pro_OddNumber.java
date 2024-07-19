//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
package com.exception_handling;

// A class to demonstrate exception handling for checking if a number is odd
public class Pro_OddNumber {
    // Main method to test checking if a number is odd
    public static void main(String[] args) {
        int number = 12; // Change this to test different numbers

        try {
            checkIfEven(number); // Check if the number is even
            System.out.println(number + " is even."); // Print if the number is even
        } catch (IllegalArgumentException e) {
            System.out.println(number + " is odd."); // Handle if the number is odd
        }
    }

    // Method to check if a number is even, throws an exception if odd
    public static void checkIfEven(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            // Throw IllegalArgumentException if the number is odd
            throw new IllegalArgumentException("Number is odd.");
        }
    }
}
/*Dry Run
12 is even.
1 is odd.
*/