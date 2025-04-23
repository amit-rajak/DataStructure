package com.LinkList;

public class SecondLargestSmallest {
    Node head;

    // Modified Node class similar to the ListNode structure
    class Node {
        int data;  // Node value
        Node next; // Pointer to the next node

        // Default constructor
        Node() {
            this.data = 0;
            this.next = null;
        }

        // Constructor with data
        Node(int data1) {
            this.data = data1;
            this.next = null;
        }

        // Constructor with data and next node reference
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }

    // Function to find second largest and second smallest element
    public void findSecondLargestAndSmallest() {
        if (head == null || head.next == null) {
            System.out.println("List doesn't have enough elements.");
            return;
        }

        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            int value = temp.data;

            // Update largest and second largest
            if (value > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = value;
            } else if (value > secondLargest && value != firstLargest) {
                secondLargest = value;
            }

            // Update smallest and second smallest
            if (value < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = value;
            } else if (value < secondSmallest && value != firstSmallest) {
                secondSmallest = value;
            }

            temp = temp.next;
        }

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    // Function to add a new node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        SecondLargestSmallest list = new SecondLargestSmallest();

        // Adding elements to the linked list
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(15);

        // Finding and printing the second largest and smallest elements
        list.findSecondLargestAndSmallest();
    }
}
