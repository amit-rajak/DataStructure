package com.striver.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthsmallestWithoutmaxheap {

    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};
        int k=3;
        int small= kthSmallest(arr,k);
        System.out.println(small);
    }

    private static int  kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i<k) {
                priorityQueue.add(arr[i]); //8 10 5
            }
            else
            {
                if(priorityQueue.peek()>arr[i]){
                    priorityQueue.poll();
                    priorityQueue.add(arr[i]);
                }
            }
        }

        Integer[] array = priorityQueue.toArray(new Integer[priorityQueue.size()]);
        Integer [] arr1= new Integer[10];
        int size=array.length;
         int data=array[size-1];

        return data;
    }

}


