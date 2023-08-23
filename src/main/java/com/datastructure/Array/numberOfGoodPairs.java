package com.datastructure.Array;

import java.util.Arrays;

public class numberOfGoodPairs {
    public static void main(String[] args) {

        int nums[]={1,2,3,1,1,3};

    System.out.println(numIdenticalPairs(nums));

    }
    public static int numIdenticalPairs(int[] nums) {
       int goog_pair=0;
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int j=0;j<101;j++)
        {
            if(arr[j]>1)
            {
                goog_pair=goog_pair+(arr[j]-1)*(arr[j])/2;
            }
        }
        return goog_pair;
    }
}
