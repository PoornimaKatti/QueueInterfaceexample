package com.SimpleQueueExample;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {


        Queue<String> simpleQueue = new LinkedList<>();

        // Using offer() to add elements
        boolean added1 = simpleQueue.offer("Poornima");
        boolean added2 = simpleQueue.offer("Deepa");
        boolean added3 = simpleQueue.offer("Gouri");

        System.out.println("Elements added successfully? " + added1 + ", " + added2 + ", " + added3);

        // Using peek() to retrieve, without removing
        String peekedName = simpleQueue.peek();
        System.out.println("Peeked: " + peekedName);

        // Using poll() to retrieve and remove
        String dequeuedName = simpleQueue.poll();
        System.out.println("Dequeued: " + dequeuedName);

        // Using element() to retrieve, without removing (throws exception if empty)
        try {
            String frontElement = simpleQueue.element();
            System.out.println("Element at the front: " + frontElement);
        } catch (Exception e) {
            System.out.println("Queue is empty.");
        }

        // Using remove() to retrieve and remove (throws exception if empty)
        try {
            String removedElement = simpleQueue.remove();
            System.out.println("Removed: " + removedElement);
        } catch (Exception e) {
            System.out.println("Queue is empty.");
        }

        // Display the current state of the queue
        System.out.println("Current Queue: " + simpleQueue);
    }
}