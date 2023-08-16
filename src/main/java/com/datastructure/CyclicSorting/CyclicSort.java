package com.datastructure.CyclicSorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int arr[]={3,5,2,1,4};

      Sort(arr);
      System.out.println(Arrays.toString(arr));

    }

    public static void Sort(int arr[])
    {
        int i=0;
        while (i<arr.length)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
    }
    public  static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
