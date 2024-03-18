package com.striver.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
     int arr[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
     //Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

        System.out.println(Arrays.toString(moveZero(arr)));
    }

   //
    public static int [] moveZero(int arr[])
    {
        ArrayList<Integer> list= new ArrayList();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                list.add(arr[i]);
            }
        }

        int NonZeroSize= list.size();


        for(int i=0;i<NonZeroSize;i++)
        {
            arr[i]=list.get(i);
        }

        for(int i=NonZeroSize;i<arr.length;i++)
        {
            arr[i]=0;
        }
        return arr;
    }
}
