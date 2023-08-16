package com.datastructure.CyclicSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class disappearedNumberInArray {
    public static void main(String[] args) {
     int arr[]={4,3,2,7,8,2,3,1};

       List l= findDisappearedNumbers(arr);
        System.out.println(l);
    }
    public static  List<Integer>  findDisappearedNumbers(int[] nums) {
        List<Integer> missing= new ArrayList<>() ;

        int i=0;
        while(i<nums.length)
        {
            int correctIndex= nums[i]-1;
            if(nums[i]!=nums[correctIndex])
            {
                swap(nums,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        //check the correct Index
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                missing.add(j+1);
            }
        }


        return missing;
    }

    public  static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
