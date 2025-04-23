package com.striver.array;

import java.util.ArrayList;

public class InterSectionOfArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3,4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3,3,4, 4, 5, 11, 12};             //2,3,4,5
        ArrayList<Integer> list = interScection(arr1, arr2);

        for(int u:list) {
            System.out.println(u);
        }
    }

    private static ArrayList<Integer> interScection(int[] arr1, int[] arr2) {

        int n= arr1.length;
        int m= arr2.length;

        //int i = 0, j = 0; // pointers
        int Visited[]=new int [m];
        ArrayList<Integer > intersection=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j] && Visited[j]==0)
                {
                    intersection.add(arr1[i]);
                    Visited[j]=1;
                            break;
                }
                if(arr2[j]>arr1[i])
                {
                    break;
                }
            }
        }


        return intersection;
    }
}
