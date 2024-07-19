//Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.
package com.lab8.demo;

// Shared resource class representing the buffer in producer-consumer scenario
class SharedResource {
    private int count = 0; // Shared variable representing the data produced/consumed
    private boolean valueSet = false; // Flag indicating whether the data is available for consumption

    // Method for producer to produce data
    public synchronized void produce() throws InterruptedException {
        // Wait until the data is consumed by consumer
        while (valueSet) {
            wait();
        }

        // Increment count and indicate that data is available
        count++;
        System.out.println("Produced: " + count);
        valueSet = true;
        
        // Notify the consumer that data is available
        notify();
    }

    // Method for consumer to consume data
    public synchronized void consume() throws InterruptedException {
        // Wait until data is produced by producer
        while (!valueSet) {
            wait();
        }

        // Consume the data and indicate that data is consumed
        System.out.println("Consumed: " + count);
        valueSet = false;

        // Notify the producer that space is available in buffer
        notify();
    }
}

// Producer class to produce data
class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Consumer class to consume data
class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Main class to demonstrate producer-consumer scenario
public class ProductConsumer {
    public static void main(String[] args) {
        // Create a shared resource
        SharedResource sharedResource = new SharedResource();

        // Create producer and consumer instances
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        // Create threads for producer and consumer
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}

/*Dry Run
 * Produced: 1
*Consumed: 1
*/
 