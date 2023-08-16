package com.datastructure.CyclicSorting;

public class DuplicateNumber2 {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int correctindex=nums[i]-1;
                if(nums[i]!=nums[correctindex])
                {
                    swap(nums,i,correctindex);
                }
                else
                {
                    return nums[i];
                }

            }
            else
            {
                i++;
            }
        }


        return -1;
    }
    public  static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

