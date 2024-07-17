package com.Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr,int k) {
        // Min-heap for finding the k-th largest element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Max-heap for finding the k-th smallest element
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<>();

        // Finding the k-th smallest element
        for (int i = 0; i < arr.size(); i++) {
            maxHeap.add(arr.get(i));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        result.add(maxHeap.peek());
        // Finding the k-th largest element
        for (int i = 0; i < arr.size(); i++) {
            minHeap.add(arr.get(i));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        result.add(minHeap.peek());

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2, 4, 5));
        int k = 3;
        ArrayList<Integer> result = kthSmallLarge(list, k);
        System.out.println(result); // Output should be [4, 2]
    }
}
