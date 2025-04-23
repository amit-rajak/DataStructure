package com.datastructure.takUtoF.mid;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int arr[]={1, 6, 2, 10, 3};

        int target=90;
        System.out.println(twoSum(arr,target));

    }
    public  static  boolean twoSum(int arr[],int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int sum=arr[start]+arr[end];
            if(sum<target){
                start++;
            }
            if(sum>target){
                end--;
            }
            if(sum==target){
                return  true;
            }
        }
        return false;
    }
}
