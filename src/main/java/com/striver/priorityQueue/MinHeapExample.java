package com.striver.priorityQueue;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapExample {

    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the min-heap
        minHeap.add(50);
        minHeap.add(15);
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        PriorityQueue<Integer> Maxheap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the min-heap
        Maxheap.add(50);
        Maxheap.add(15);
        Maxheap.add(40);
        Maxheap.add(10);
        Maxheap.add(30);

        // Print the heap before insertion
        System.out.println("Min-Heap before insertion: " + minHeap);
        System.out.println("Maxheap-Heap before insertion: " + Maxheap);

        // Insert a new element
        minHeap.add(5);
        Maxheap.add(5);
        // Print the heap after insertion
        System.out.println("Min-Heap after insertion: " + minHeap);

        // Extract the minimum element
        int minElement = minHeap.poll();
        System.out.println("Extracted min element: " + minElement);

        // Peek at the minimum element without extracting it
        int peekElement = minHeap.peek();
        System.out.println("Current min element (peek): " + peekElement);

        // Print the elements in the heap after extraction
        System.out.println("Min-Heap elements after extraction: " + minHeap);
        System.out.println("Maxheap-Heap elements after extraction: " + Maxheap);
    }
}

