package com.datastructure.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 17};

        int Printarr[]=reveres(arr);

        for(int data1:Printarr)
        {
            System.out.print(data1 +" ");
        }
    }

    public static int[] reveres(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }


    public  static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
