package com.interview.questions.java;

import java.util.ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,3, 4, 5, 5, 6, 7, 5, 7, 7};
        int[] result = removeConsecutiveDuplicates(arr);

        System.out.println("Array with specific consecutive duplicates removed:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Check if the current element is the same as the next one
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                // Skip the next element
                i++;
            } else {
                // Add the current element to the list
                list.add(arr[i]);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
