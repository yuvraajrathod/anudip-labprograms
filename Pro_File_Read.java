//Write a Java program to create a method that reads a file and throws an exception if the file is not found.
package com.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// A class to demonstrate exception handling for reading a file
public class Pro_File_Read {
    // Main method to test reading a file
    public static void main(String[] args) {
        try {
            // Attempt to read the file
            readFile("intro.txt");
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException if the file is not found
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to read a file, throws FileNotFoundException if the file is not found
    public static void readFile(String fileName) throws FileNotFoundException {
        // Create a File object with the given file name
        File file = new File(fileName);
        // Create a Scanner object to read from the file
        Scanner sc = new Scanner(file);

        // Read and print each line from the file
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
/*Dry Run
Error: intro.txt (The system cannot find the file specified)*/