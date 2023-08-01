package com.datastructure.Array;

import java.util.Arrays;

public class FindFirstandLastIndex {

    public static void main(String[] args) {

        int arr[]={5,7,7,8,8,10};
        int target=8;
        int arr1[]=FindFirstLast(arr,target);
        System.out.println(Arrays.toString(arr1)); // Output: [3, 4]

    }

    public static int[] FindFirstLast(int arr[],int target)
    {

        int start=-1;
        int end=-1;
           for(int i=0;i<arr.length-1;i++) {
               if (target == arr[i]) {
                   start = i;
                   break;

               }
           }
        for(int j= arr.length-1;j>=0;j--) {
            if (target == arr[j]) {
                end = j;
                break;

            }
        }

        return new int[]{start,end};
    }
}
