package com.datastructure.BinarySerch;

public class OrderAgnosticBs {
    public static void main(String[] args) {
      // int arr[]={-18,4,5,6,7,8,9,11,16,17,19,21,23,34};
       int arr[]={99,80,75,22,11,10,5,2,-3};
        int target=22;
        int ans=orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }
    public  static int orderAgnosticBinarySearch(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }}
