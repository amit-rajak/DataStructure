package com.datastructure.Array;


import java.util.ArrayList;

class FindDuplicate {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] freq = new int[n];

        // Count the frequency of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Find elements that appear more than once
        for (int i = 0; i < n; i++) {
            if (freq[i] > 1) {
                result.add(i);
            }
        }

        // If no duplicates found, return [-1]
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int[] arr1 = {0, 3, 1, 2};
        System.out.println(duplicates(arr1, n1)); // Output: [-1]

        int n2 = 5;
        int[] arr2 = {2, 3, 1, 2, 3,20,20};
        System.out.println(duplicates(arr2, n2)); // Output: [2, 3]
    }
}
