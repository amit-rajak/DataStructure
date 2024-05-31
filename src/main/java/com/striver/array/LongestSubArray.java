package com.striver.array;

public class LongestSubArray {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long data = 10;
        int len = LongestSubArrayWithGivenSum(a, data);  //(n*3);
        System.out.println(len);

    }


    public static int LongestSubArrayWithGivenSum(int arr[],long data)
    {
       int len=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                long sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }

                if(sum==data)
                {
                    len=Math.max(len,j-i+1);
                }
            }
        }

        return len;
    }
}
