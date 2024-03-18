package com.striver.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindTheUnion {

    public static void main(String[] args) {

        int arr1[] = {1,12, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        System.out.println(Union(arr1,arr2));
    }

    public  static  ArrayList<Integer> Union(int arr1[],int arr2[])
    {
         HashSet <Integer> set=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        for(int list:set)
        {
            Union.add(list);
        }


        return Union;
    }

}
