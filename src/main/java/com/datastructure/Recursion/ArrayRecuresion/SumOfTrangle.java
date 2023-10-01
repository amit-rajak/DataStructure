package com.datastructure.Recursion.ArrayRecuresion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumOfTrangle {

    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5};
        int[] arr = {4, 7, 3, 6, 7};
        traingleSum(arr);
       // traingleSumAll(arr,new ArrayList<>());
    }

    public static void traingleSum(int arr[]) {

        if (arr.length <= 1) {
            return;
        }

        int temp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        traingleSum(temp);
        System.out.println(Arrays.toString(temp));


    }

    public static void traingleSumAll(int arr[],ArrayList list) {

        if (arr.length <= 1) {
            return;
        }

        int temp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            list.add(x);
        }
        traingleSum(temp);
        System.out.println(list);

    }
}