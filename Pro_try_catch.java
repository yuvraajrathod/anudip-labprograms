//Write a Java program that throws an exception and catch it using a try-catch block.
package com.exception_handling;

// A class to demonstrate the usage of try-catch block for handling exceptions
public class Pro_try_catch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int res = a / b; // This line will throw an ArithmeticException
            System.out.println("Result is:" + res); // This line will not be executed
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Cannot divide by zero.");
        }
    }
}
/*Dry Run
Cannot divide by zero.
*/