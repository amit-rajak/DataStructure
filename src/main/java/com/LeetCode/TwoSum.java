package com.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 9;
       int arr[]= new int[2];
       arr=twoSum(nums,target);

       /*for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }*/


        System.out.println(Arrays.toString(twoSum(nums,target)));
    }


    public static int[] twoSum(int[] nums, int target) {


        int arr[]=new int [2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            int difference= target-nums[i];

            if(map.containsKey(difference))
            {
                arr[0]=map.get(difference);
                arr[1]=i;
                return arr;
            }

                map.put(nums[i],i);
        }
        return arr;
    }
}