package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

// A class to demonstrate exception handling for input mismatch
public class Pro_InputMiss {

    // Main method to test input mismatch exception handling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer:");
        try {
            int n1 = sc.nextInt(); // Attempt to read an integer input
            System.out.println("Entered Value:" + n1);
        } catch (InputMismatchException e) {
            // Handle InputMismatchException if non-integer input is provided
            System.out.println("Invalid Input. Please Enter an Integer.");
        }
    }
}
/*DryRun
Enter An Integer:
t
Invalid Input.Please Enter an Integer :
*/