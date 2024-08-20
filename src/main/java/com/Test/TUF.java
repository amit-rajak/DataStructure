package com.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

class TUF {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        // Initialize a HashMap to store the frequency of each element
        HashMap<Integer, Integer> freq = new HashMap<>();
        // Initialize an ArrayList to store the union of the arrays
        ArrayList<Integer> Union = new ArrayList<>();

        // Populate the HashMap with elements from the first array
        for (int i = 0; i < n; i++)
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);

        // Populate the HashMap with elements from the second array
        for (int i = 0; i < m; i++)
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);

        // Print the keys in the freq HashMap
        Set<Integer> keys = freq.keySet();
        System.out.println("Keys in freq HashMap: " + keys);

        // Add all keys from the HashMap to the Union list
        for (int it : keys)
            Union.add(it);

        // Sort the Union list
        Collections.sort(Union);
        return Union;
    }

    public static void main(String args[]) {
        int n = 11, m = 8;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12,20};

        // Find the union of arr1 and arr2
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);

        // Print the union of the arrays
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
