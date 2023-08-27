package com.datastructure.Recursion.ArrayRecuresion;

//check Array Is sorted Or NOT
public class SortedOrNot {
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7,10,9};

         System.out.println(CheckSorted(arr,0));

    }
    public static  boolean CheckSorted(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && CheckSorted(arr,index+1);
    }

}
