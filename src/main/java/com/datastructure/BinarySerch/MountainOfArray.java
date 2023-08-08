package com.datastructure.BinarySerch;

public class MountainOfArray {

    public static void main(String[] args) {


        int arr[]={0,10,5,2};
        int ans=peekOfArray(arr);
        System.out.println(ans);

    }
    public static int peekOfArray(int arr[])
    {
        int start=0;
        int end= arr.length-1;

        while(end>start)
        {
            int mid =start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                end=mid;
             }
            else
            {
                start=mid+1;
            }
        }
        return start;// we can return and end and start both;
    }

}
