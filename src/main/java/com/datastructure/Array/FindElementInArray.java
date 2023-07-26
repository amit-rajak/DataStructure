package com.datastructure.Array;

/*Find element in an Array

input :- int arr[]={10,14,9,16,10,9};*/

public class FindElementInArray {
    public static void main(String[] args) {

        int arr[]={10,14,9,16,10,9,10};
        int findElement=11;
       FindElementIndex(arr,findElement);

    }

    public static void  FindElementIndex(int arr[],int findElement)
    {
        int index=0;
        int count=0;
        for (int i=0; i<arr.length;i++)
        {
            if(arr[i]==findElement)
            {
                System.out.println(i);
                count++;
            }

        }
        if(count<=0)
        {
            System.out.print("data not found");
        }


    }
}
