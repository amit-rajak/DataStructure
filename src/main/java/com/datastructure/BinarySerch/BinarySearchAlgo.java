package com.datastructure.BinarySerch;

public class BinarySearchAlgo {

    public static void main(String[] args) {
        int arr[]={-18,4,5,6,7,8,9,11,16,17,19,21,23,34};
        int target=-18;
        System.out.println(binarySearch(arr,target));
    }

    public  static int binarySearch(int arr[],int target)
    {
        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }

        }

        return -1;
    }
}
