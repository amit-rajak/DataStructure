package com.striver.array;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplice {
    public static void main(String[] args) {

        int arr[]={0,0,1,1,1,2,2,3,3,4,8,8};
     System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;

    }
}
