package com.datastructure.Array;

//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class NumberWithEven {

    public static void main(String[] args) {

        int nums[] = {555,9011,482,177};

        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {

        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(even(nums[i])%2==0)
            {
                count++;
            }

        }
        return count;

    }

    private static int even(int num) {
        int count=0;
        while (num>0)
        {
            num=num/10;
            count++;
        }
        return count;
    }

}
