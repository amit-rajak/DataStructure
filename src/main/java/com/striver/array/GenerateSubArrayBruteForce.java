package com.striver.array;

public class GenerateSubArrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        SubArray(arr);
    }
    public static void SubArray(int arr[])
    {
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){

              for(int k=i;k<=j;k++){
                  System.out.print(arr[k]+"");

              }
                System.out.println();
            }
        }
    }
}
