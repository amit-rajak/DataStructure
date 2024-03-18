package com.striver.Array;

import java.util.ArrayList;

public class OptimalIntersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};             //2,3,4,5
        ArrayList<Integer> list = interScectionOpt(arr1, arr2);

        for(int u:list) {
            System.out.println(u);
        }
    }

    private static ArrayList<Integer> interScectionOpt(int[] arr1, int[] arr2) {
        int n= arr1.length;
        int m= arr2.length;

        int i = 0, j = 0; // pointers
        ArrayList<Integer > intersection=new ArrayList<>();

        while (i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if (arr2[j]<arr1[i]) {
                j++;

            }

            else
            {
                intersection.add(arr1[i]);
                i++;
                j++;

            }
        }
        return intersection;
    }
}
