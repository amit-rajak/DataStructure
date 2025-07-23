package com.datastructure.Recursion.BeginRecuression.medium;

public class CheckArraySortedOrNot {

    public static void main(String[] args) {

        int arr[]= {10,2,5,6,7,12,15};

        System.out.println(sorted(arr,0));

    }

    private static boolean sorted(int[] arr, int i) {

        if(i==arr.length-1)
        {
            return  true;

        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        else
        {
            return  sorted(arr,i+1);
        }


    }
}
