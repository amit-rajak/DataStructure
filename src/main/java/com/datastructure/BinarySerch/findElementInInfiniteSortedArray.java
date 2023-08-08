package com.datastructure.BinarySerch;


//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class findElementInInfiniteSortedArray {
    public static void main(String[] args) {

        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int target=170;

        int ans=findPositionOfElement(arr,target);
        System.out.println(ans);
    }

    public static  int  findPositionOfElement(int arr[],int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;  //we can use this one also for doubling the box;
            //end = end + (end + 1) * 2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public  static int binarySearch(int arr[],int target,int start,int end)
    {
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
