package com.striver.array;

import java.util.ArrayList;

public class FindTheUnionOptimal {
    public static void main(String[] args) {
        int arr1[] = {1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> list = Union1(arr1, arr2);

        for(int u:list) {
            System.out.println(u);
        }
    }

    public  static ArrayList<Integer> Union1(int arr1[], int arr2[])
    {


        int n= arr1.length;
        int m= arr2.length;

        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {

                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    }

