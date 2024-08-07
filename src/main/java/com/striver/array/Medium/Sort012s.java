package com.striver.array.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012s {
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

    private static void sortArray(ArrayList<Integer> arr, int n) {
        int count_0=0;
        int count_1=0;
        int count_2=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                count_0++;
            } else if (arr.get(i)==1) {
                count_1++;
            }else {
                count_2++;
            }
        }

        for(int i=0;i< count_0;i++){
            arr.set(i,0);
        }
        for(int i=count_0;i< count_0+count_1;i++){
            arr.set(i,1);
        }
        for(int i=count_0+count_1;i<n;i++){
            arr.set(i,2);
        }

    }

}
