package com.lab8.demo;

// Thread class to print prime numbers
public class PrimeNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Check if the number is prime
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    System.out.println("Prime No.= " + i);
                }
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            }
        } catch (Exception e) {
        }
    }
}

// Thread class to print non-prime numbers
class NotPrime extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Check if the number is non-prime
                if (i == 4 || i == 6 || i == 8 || i == 9 || i == 10) {
                    System.out.println("Non-Prime No.= " + i);
                }
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            }
        } catch (Exception e) {
        }
    }
}

// Main class to demonstrate thread functionality
class ThreadDemo {
    public static void main(String args[]) {
        // Start two threads, one for prime numbers and one for non-prime numbers
        new PrimeNumbers().start();
        new NotPrime().start();
    }
}
/*Dry Run

Prime No.= 2
Non-Prime No.= 4
Prime No.= 3
Non-Prime No.= 6
Prime No.= 5
Non-Prime No.= 8
Prime No.= 7
Non-Prime No.= 9
Non-Prime No.= 10
*/