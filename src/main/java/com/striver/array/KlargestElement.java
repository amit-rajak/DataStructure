package com.striver.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KlargestElement {
    public static void main(String[] args) {

        int arr[] =  {8,10,5,7,9,12};
        int k=3;
        int[] small = kLargestElement(arr,k);
        System.out.println(Arrays.toString(small));
    }

    private static int[] kLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> minheap= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i<k){
                minheap.add(arr[i]);
            }
            else
            {
                if(arr[i]>minheap.peek()){
                    minheap.poll();
                    minheap.add(arr[i]);
                }
            }
        }
        // Convert PriorityQueue to array
        int[] result = new int[k];
        int index = 0;
        while (!minheap.isEmpty()) {
            result[index++] = minheap.poll();
        }

        return result;
    }
}
