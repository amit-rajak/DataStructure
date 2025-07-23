package com.datastructure.Recursion.BeginRecuression.medium;

public class Serchtarget {

    public static void main(String[] args) {

        int arr[]={10,12,15,13,16,19};
        int target =13;

        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {

        return helper(arr, target,0);

    }

    private static int helper(int[] arr, int target, int i) {

        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        else
        {
            return helper(arr,target,i+1);
        }

    }

}
