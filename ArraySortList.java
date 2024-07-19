//Write a Java program to sort a given array list.


package com.lab7.demo;

import java.util.ArrayList;
import java.util.Collections;

// A class to demonstrate sorting of ArrayList
public class ArraySortList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Nivedita");
        names.add("Akanksha");
        names.add("Tushar");
        names.add("Rajat");
        names.add("Sukesh");
        names.add("Kaushik");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList : " + names);

        // Sort the ArrayList using Collections.sort() method
        Collections.sort(names);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList : " + names);
    }
}
/*Dry Run
Unsorted ArrayList : [Nivedita, Akanksha, Tushar, Rajat, Sukesh, Kaushik]
Sorted ArrayList : [Akanksha, Kaushik, Nivedita, Rajat, Sukesh, Tushar]
*/