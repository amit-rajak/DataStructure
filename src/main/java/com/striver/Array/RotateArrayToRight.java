package com.striver.Array;

import java.util.Arrays;

public class RotateArrayToRight {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
       // int arr[]={-1,-100,3,99};
        int k=3;
        int n=arr.length;
        if(n==1)
        {
            return;
        }
        k = k % n;  //rotating factor is greater than array Length
        revArray(arr,0,n-k-1);
        revArray(arr,n-k,n-1);
        revArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }




    public static void revArray(int arr[],int start,int end)
    {     int temp;
        while (start<=end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
