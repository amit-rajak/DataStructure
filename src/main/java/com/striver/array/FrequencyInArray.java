package com.striver.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
         frequencyArray(arr);
    }

    public static void frequencyArray(int arr[]){
        Map<Integer,Integer> map= new HashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],count+1);
            }else{
                map.put(arr[i],count);
            }
        }
        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1)
            {
                System.out.println("Element: " + entry.getKey());
            }
          //  System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
