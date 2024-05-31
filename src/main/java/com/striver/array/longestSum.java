package com.striver.array;
public class longestSum {
    public static void main(String[] args) {
        int[] arr = {1,1,6,3,5,9,9,9,9,2,9};
        System.out.println(SubArray(arr,9));
    }
    public static int SubArray(int arr[],int element)
    {     int length=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                   // System.out.print(arr[k]+"");//finding all sub array
                    sum=sum+arr[k];
                    //System.out.println(sum);
                }
                if(sum==element){
                    length=Math.max(length,j-i+1);
                }

            }
        }
        return length;
    }
}
