package com.striver.array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public interface twoSum {
    public static void main(String[] args) {
        int arr[]={2,11,15,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSumOfTraget(arr,target)));
    }

    static int[] twoSumOfTraget(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){

            int nextData= target-arr[i];
            if(map.containsKey(nextData)){
                return new int[] {map.get(nextData),i};
            }
           map.put(arr[i],i);
        }
     return new int[] {-1,-1};
    }
}
