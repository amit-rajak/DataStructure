package com.datastructure.CyclicSorting;

public class missingNumber {
    public static void main(String[] args) {

        int arr[]={9,6,4,2,3,5,7,0,1};
      System.out.println(findNumber(arr));

    }
    public static int findNumber(int arr[])
    {
        int i=0;
        while (i<arr.length)
        {
            int correctIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        //search in sorted

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return  arr.length;

    }
    public  static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
