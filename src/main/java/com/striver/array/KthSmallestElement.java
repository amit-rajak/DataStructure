package com.striver.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {


    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};
        int k=3;
       int small= kthSmallest(arr,k);
       System.out.println(small);
    }

    private static int  kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            priorityQueue.add(arr[i]); //8 10 5
        }

        for(int i=k;i<arr.length;i++){
            if(arr[i]<priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }

        }
        return priorityQueue.peek();
    }

}
