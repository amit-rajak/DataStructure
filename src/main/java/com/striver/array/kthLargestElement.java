package com.striver.array;

import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};
        int k=3;
       int la= kthLargest(arr,k);
       System.out.println(la);
    }

    private static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer>priorityQueue= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i<k) {
                priorityQueue.add(arr[i]);
            }
            else
            {
                if(arr[i]>priorityQueue.peek()){
                    priorityQueue.poll();
                    priorityQueue.add(arr[i]);
                }
            }
        }
        return priorityQueue.peek();
    }
}
