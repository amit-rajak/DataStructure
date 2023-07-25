package com.datastructure.Array;
//Write a Java program to find the maximum element in an array of integers.
public class MaximumElement {

    public static void main(String[] args) {
        int arr[]={10,20,89,6,7,90};
        System.out.print("Max element in array "+ findMaxElement(arr));
    }

    private static int findMaxElement(int[] arr) {
         int max= arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]>max)
                 max=arr[i];
         }
         return max;
    } 


}
