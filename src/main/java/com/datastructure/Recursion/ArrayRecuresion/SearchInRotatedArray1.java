package com.datastructure.Recursion.ArrayRecuresion;

public class SearchInRotatedArray1 {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
       // int arr[]={3,1};
        int target=2;
        int start=0;
        int end=arr.length-1;
       // int ans=search(arr,target,start,end);
        System.out.println(search(arr,1,0, arr.length-1));

    }

    public static int search(int[] nums, int target,int start,int end) {


        if (start>end)
        {
            return -1;
        }
            int mid=start+(end-start)/2;
            if (nums[mid]==target)
            {
                return mid;
            }

            if(nums[start]<=nums[mid])
            {
                if(target>=nums[start] && target<=nums[mid])
                {
                   return search(nums,target,start,mid-1);
                }
                else {
                   return search(nums,target,mid+1,end);

                }
            }

            if(target>=nums[mid] && target<=nums[end])
                {
                   return search(nums,target,mid+1,end);
                }

              return search(nums,target,start,mid-1);




    }
}
