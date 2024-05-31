package com.striver.array;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};

        System.out.println(MaxElementInArray(arr,arr.length));
    }

    public static  int MaxElementInArray(int arr[],int length)
    {if(length==1)
        {
            return arr[0];
        }

        int maxelement=MaxElementInArray(arr,length-1);
        return Math.max(arr[length-1],maxelement);
    }
}
