package com.datastructure.BinarySearch2DArray;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {

        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}
              };

        System.out.println(Arrays.toString(BS2DArray(arr,37)));
    }

    public static int [] BS2DArray(int arr[][],int target)
    {
        int row=0;
        int col= arr.length-1;

        while(row< arr.length && col>=0)
        {
            if(arr[row][col]==target)
            {
                return new int[]{row, col};
            }
            if(arr[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}
