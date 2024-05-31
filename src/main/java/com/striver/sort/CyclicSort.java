package com.striver.sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={1,4,5,3,2};
       sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public  static  void sort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex=arr[i]-1;
            if(correctIndex!=arr[i])
            {
                swapArray(arr,i,correctIndex);
            }else {
                i++;
            }

        }


    }

    private static void swapArray(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
