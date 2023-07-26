package com.datastructure.Array2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//print [1,2] in this format also
public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {10,12,14,16,19},
                {19,20,18,22,26},
                {10,28,28,00,-20},
                {10,28,28,00,-20}
        };
        int target=28;
        findElementIn2D(arr,target);
        int ReturnIndex[]=findElementIn2DReturn(arr,target);
        System.out.println(Arrays.toString(ReturnIndex));

        //Using List
        List<int[]> indices = findElementIn2DReturnUsingList(arr, target);



        //here List will like this  { [1,2] ,[2,2],[3,1],[3,2]}

        if (indices.isEmpty()) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            for (int[] index : indices) {
                System.out.println("Target " + target + " found at index (" + index[0] + ", " + index[1] + ")");
            }
        }

    }

    private static void  findElementIn2D(int[][] arr, int target) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println("index is "+i+","+j);
                    count++;
                }
            }
        }
        if(count<=0)
        {
            System.out.println("data not found");
        }
    }
//it will print only one index
    private static int[] findElementIn2DReturn(int[][] arr, int target) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1};
    }

    // print All Index
    public static List<int[]> findElementIn2DReturnUsingList(int[][] arr, int target) {
        int count=0;
        List<int[]> list= new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i][j]==target)
                {
                    list.add(new int[]{i,j});

                }
            }

        }
        return list;

    }


}
