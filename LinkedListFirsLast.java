//Write a Java program to get the first and last occurrence of the specified elements in a linked list.


package com.lab7.demo;

import java.util.LinkedList;

// A class to demonstrate getting the first and last occurrence of elements in a linked list
public class LinkedListFirsLast {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(15);
        l1.add(2);
        l1.add(6);
        l1.add(36);
        l1.add(63);
        
        // getFirst: prints the first element of the linked list
        System.out.println("First Element is :" + l1.getFirst());
        
        // getLast: prints the last element of the linked list
        System.out.println("Last Element : " + l1.getLast());
    }
}
/*Dry Run
First Element is :5
Last Element : 63*/