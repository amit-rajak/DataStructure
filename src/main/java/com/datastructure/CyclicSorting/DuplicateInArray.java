package com.datastructure.CyclicSorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class DuplicateInArray {
    public static void main(String[] args) {

        int arr[]={4,3,2,7,8,2,3,1};

        List l= findDuplicates(arr);
        System.out.println(l);
    }

    public static List<Integer> findDuplicates(int[] nums) {

        int i=0;
        while (i<nums.length)
        {
            int CorrectIndex=nums[i]-1;
            if(nums[i]!=nums[CorrectIndex])
            {
                swap(nums,i,CorrectIndex);
            }
            else
            {
                i++;
            }
        }
        // find duplicate;
        List<Integer> dup= new ArrayList<>() ;


        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                dup.add(nums[j]);
            }
        }

        return dup;
    }
    public static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
