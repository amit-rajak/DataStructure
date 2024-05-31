package com.datastructure;

import java.util.Arrays;

public class RotationArrayList {
    public static void main(String[] args) {
        //Array Rotation
        //i/p [1,2,3,4,5,6,7]
        //i/p: n = 3
        //o/p: [5,6,7,1,2,3,4]
        //ex:
        //1st rotation = [7,1,2,3,4,5,6]
        //2nd rotation = [6,7,1,2,3,4,5]
        //3rd rotation = [5,6,7,1,2,3,4]
        int arr[]={1,2,3,4,5,6,7};
                int n=3;

              revs(arr,0,n);
              revs(arr,n+1,arr.length-1);
              revs(arr,0,arr.length-1);

              System.out.println(Arrays.toString(arr));

    }
    public  static void revs(int arr[],int i, int k){
       while(i<k)
       {
           int temp=arr[i];
           arr[i]=arr[k];
           arr[k]=temp;
           i++;
           k--;

       }

    }


}
