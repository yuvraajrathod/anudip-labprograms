//Write a Java program to find numbers less than 7 in a tree set.


package com.lab7.demo;

import java.util.TreeSet;

public class TreeSetLessThan7 {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements to the TreeSet
        ts.add(5); // Adding 5 to the TreeSet
        ts.add(2); // Adding 2 to the TreeSet
        ts.add(8); // Adding 8 to the TreeSet
        ts.add(1); // Adding 1 to the TreeSet
        ts.add(3); // Adding 3 to the TreeSet
        ts.add(7); // Adding 7 to the TreeSet
        ts.add(6); // Adding 6 to the TreeSet

        // Print numbers less than 7 in the TreeSet
        System.out.println("Numbers less than 7 in the TreeSet:");
        for (Integer num : ts) { // Loop through each element in the TreeSet
            if (num < 7) { // Check if the element is less than 7
                System.out.println(num); // Print the element if it's less than 7
            }
        }
    }
}
/*Dry Run
Numbers less than 7 in the TreeSet:
1
2
3
5
6
*/