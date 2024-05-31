package com.striver.array;

public class ArrayIsSorted {
    public static void main(String[] args) {

        int arr[]={3,4,5,1,2};
        System.out.println(ArrayIsSorted(arr,arr.length));
    }

    public static boolean ArrayIsSorted(int arr[],int length)
    {
        //boolean flag=false;
        for(int i=1;i<length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}
