package com.datastructure.BinarySerch;

//https://leetcode.com/problems/find-in-mountain-array/
public class rotateSortedArray {

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,3,1};
        int target=3;
        int ans=FindIndex(arr,target);
        System.out.println(ans);
    }

    public static int FindIndex(int arr[],int target)
    {
         //if found pick of Array apply BS for left of peak and right of peak
        int pick=peekOfArray(arr);
        if(arr[pick]==target)
        {
            return pick;
        }
        //
        int rigt=orderAgnosticBinarySearch(arr,target,pick,arr.length-1);
        int left=orderAgnosticBinarySearch(arr,target,0,pick);

        if(left!=-1)
        {
            return left;
        }

     else
         return rigt;

    }

    //find pick of Array
    public static int peekOfArray(int arr[])
    {
        int start=0;
        int end= arr.length-1;

        while(end>start)
        {
            int mid =start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;// we can return and end and start both;
    }

    //binary serch

    public  static int orderAgnosticBinarySearch(int arr[],int target,int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }}
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1)
        {
            return;
        }
        k = k % n;  //rotating factor is greater than array Length
        revArray(nums,0,n-k-1); //7-3-1=3
        revArray(nums,n-k,n-1);//7-3=4  ,7-1=6
        revArray(nums,0,n-1); //0,6
        //4321765
        

    }

    public static void revArray(int arr[],int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }}
