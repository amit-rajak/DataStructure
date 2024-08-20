package com.striver.array;

import java.util.Arrays;

public class Findindex {

    public static void main(String[] args) {

        //int arr[] = {5,7,7,8,8,10};
        int arr[]={};
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
       result[1] = findLast(nums, target);
        return result;
    }



    private static int findFirst(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int index = -1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
           if(target==arr[mid])
           {
               index= mid;
           }
        }


        return index;
    }
    private static int findLast(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int index1 = -1;
        while (left<=right){
            int mid =left+(right-left)/2;
            if(arr[mid]<=target)
            {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
            if(arr[mid]==target){
                index1=mid;
            }
        }
        return index1;
    }


}

