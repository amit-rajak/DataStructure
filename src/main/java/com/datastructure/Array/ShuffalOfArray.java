//https://leetcode.com/problems/shuffle-the-array/description/
package com.datastructure.Array;

import java.util.Arrays;
public class ShuffalOfArray {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,7};
        int target=3;
        int prr[]= new int[arr.length];
        System.out.println(Arrays.toString(shuffle(arr,target)));

    }
    public static int[] shuffle(int[] nums, int n) {


        int arr[]=new int [n*2];

        int depth=n;
        for(int i=0;i<depth;i++)
        {
            arr[i+i]=nums[i];
            arr[i+i+1]= nums[n++];
        }

        return arr;


    }


}
