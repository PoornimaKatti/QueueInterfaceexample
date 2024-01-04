package com.SimpleQueueExample;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Using offerLast() to add elements to the end (tail)
        arrayDeque.offerLast("Element1");
        arrayDeque.offerLast("Element2");

        // Using offerFirst() to add elements to the front (head)
        arrayDeque.offerFirst("Element0");

        // Using pollFirst() to retrieve and remove from the front (head)
        String removedElement = arrayDeque.pollFirst();
        System.out.println("Removed Element: " + removedElement);

        // Using peekFirst() to retrieve from the front (head) without removing
        String peekedElement = arrayDeque.peekFirst();
        System.out.println("Peeked Element: " + peekedElement);

        // Using pollLast() to retrieve and remove from the end (tail)
        String removedLastElement = arrayDeque.pollLast();
        System.out.println("Removed Last Element: " + removedLastElement);

        // Using peekLast() to retrieve from the end (tail) without removing
        String peekedLastElement = arrayDeque.peekLast();
        System.out.println("Peeked Last Element: " + peekedLastElement);

        // Display the current state of the deque
        System.out.println("Current Deque: " + arrayDeque);
    }

}
