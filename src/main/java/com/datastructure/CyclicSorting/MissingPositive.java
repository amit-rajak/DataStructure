package com.datastructure.CyclicSorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int arr[]={7,8,9,11,12};//[3,4,-1,1]

        firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));

    }
    public static  int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int CorrectIndex=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[CorrectIndex])
            {
                swap(nums,i,CorrectIndex);
            }
            else
            {
                i++;
            }
        }
        // find missing element
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            return j+1;
        }


        return nums.length+1;
    }
    public static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

