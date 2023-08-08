package com.datastructure.BinarySerch;

public class SearchInRotatedArray {

    public static void main(String[] args) {
      //int arr[]={4,5,6,7,0,1,2};
     int arr[]={3,1};
      int target=0;
      int ans=search(arr,target);
      System.out.println(ans);

    }

    public static int search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;


        while (end>=start)
        {


            int mid=start+(end-start)/2;
            System.out.println(mid);
            if (nums[mid]==target)
            {
                return mid;
            }

            if(nums[start]<=nums[mid])
            {
                if(target>=nums[start] && target<nums[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else
            {
                if(target>nums[mid] && target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
