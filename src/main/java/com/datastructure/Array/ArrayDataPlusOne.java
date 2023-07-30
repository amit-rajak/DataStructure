package com.datastructure.Array;

//https://leetcode.com/problems/plus-one/
/*Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].*/
public class ArrayDataPlusOne {
    public static void main(String[] args) {

        //int arr[]={1,2,3};
        //int arr[]={1,2,9};
        //int arr[]={1,9,9};
        int arr[]={9,9,9};
        int res[]=plusOne(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }

    }
    public static int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--)
        {
          if(digits[i]!=9)
          {
              digits[i]++;
              return digits;
          }
          else
          {
              digits[i]=0;
          }
        }

        if(digits[0]==0)
        {
             digits =new int[digits.length+1];
            digits[0]=1;
            return  digits;
        }

        return digits;
    }
}
