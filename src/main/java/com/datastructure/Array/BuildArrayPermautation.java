package com.datastructure.Array;

//https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayPermautation {
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        int arr[]=buildArray(nums);
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/

        System.out.println(Arrays.toString(buildArray(nums)));

    }

    public static int[] buildArray(int[] nums) {

        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(n*(nums[nums[i]]%n)+nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
            nums[j]=nums[j]/n;
        }
        return nums;


    }
}
