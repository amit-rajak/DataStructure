package com.datastructure.Recursion.BeginRecuression.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangleFromArray {
    public static void main(String[] args) {

        int arr[]={1, 2, 3, 4, 5};
         sumTriangle(arr);


        List<int[]> triangle = sumTriangle2(arr);

        for (int[] level : triangle) {
            System.out.println(Arrays.toString(level));
        }
    }

    public static void sumTriangle(int arr[]){

        if(arr.length<1)
        {
            return;
        }
        int temp[] = new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++)
        {

            int x= arr[i]+arr[i+1];
             temp[i] = x;
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));

    }

    public static List<int[]> sumTriangle2(int arr[]){

        List<int[]>  list = new ArrayList<>();

        if(arr.length<1)
        {
            return list;
        }
        int temp[] = new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++)
        {

            int x= arr[i]+arr[i+1];
            temp[i] = x;
        }
         list=sumTriangle2(temp);
         list.add(arr);

         return list;

    }


}
