//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels
package com.exception_handling;

// Main class demonstrating exception handling for checking vowels in a string
public class Pro_Vowels {
    public static void main(String[] args) {
        try {
            // Input string
            String text = "Java handling and managing exceptions ";
            System.out.println("Original string: " + text);
            
            // Check if string contains vowels
            checkVowels(text);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            // Handle exception if string does not contain vowels
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check if a string contains vowels
    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        // Iterate through the characters of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is a vowel
            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
                break;
            }
        }
        // If no vowels found, throw an exception
        if (!containsVowels) {
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}

// Custom exception class for handling cases when no vowels are found in the string
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
/*Dry Run
Original string: Java handling and managing exceptions 
String contains vowels.
*/