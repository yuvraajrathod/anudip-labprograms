//Write a Java program to count the number of key-value (size) mappings in a map.
package com.lab7.demo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  

        // Add key-value mappings to the HashMap
        hash_map.put(1, "Nivedita"); // Adding key=1, value="Nivedita" to the HashMap
        hash_map.put(2, "Akanksha"); // Adding key=2, value="Akanksha" to the HashMap
        hash_map.put(3, "Kaushik"); // Adding key=3, value="Kaushik" to the HashMap
        hash_map.put(4, "Tushar"); // Adding key=4, value="Tushar" to the HashMap
        hash_map.put(5, "Rajt"); // Adding key=5, value="Rajt" to the HashMap

        // Print the size of the HashMap (number of key-value mappings)
        System.out.println("Size of the hash map: " + hash_map.size());
    }
}
/*Dry Run
Size of the hash map: 5*/