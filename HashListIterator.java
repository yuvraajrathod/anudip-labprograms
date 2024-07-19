//Write a Java program to iterate through all elements in a hash list.

package com.lab7.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class HashListIterator {
    public static void main(String[] args) {
        // Create a hash list (ArrayList)
        ArrayList<String> hashList = new ArrayList<>();

        // Add elements to the hash list
        hashList.add("Apple"); // Adding "Apple" to the hash list
        hashList.add("Banana"); // Adding "Banana" to the hash list
        hashList.add("Orange"); // Adding "Orange" to the hash list
        hashList.add("Grapes"); // Adding "Grapes" to the hash list
        hashList.add("Mango"); // Adding "Mango" to the hash list

        // Iterate through the hash list using an Iterator
        System.out.println("Iterating through the hash list:");
        Iterator<String> iterator = hashList.iterator(); // Creating an iterator for the hash list
        while (iterator.hasNext()) { // Loop until there are more elements in the hash list
            String element = iterator.next(); // Get the next element from the hash list
            System.out.println(element); // Print the element
        }
    }
}
/*Dry Run
Iterating through the hash list:
Apple
Banana
Orange
Grapes
Mango
*/