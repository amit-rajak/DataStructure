package com.striver.array;

public class GerarateArrSubArrayBruteForce {
    public static void main(String[] args) {

        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int value=3;
       int length= lenOfLongSubarrON3(arr,value);
       System.out.println(length);
        int length1= lenOfLongSubarrON2(arr,value);
        System.out.println("ON2"+" ="+length1);
    }

    public static int lenOfLongSubarrON3 (int arr[], int K) {
        //Complete the function
        int length=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                int sum=0;
                for(int l=i;l<=j;l++){
                    sum=sum+arr[l];

                }
                if(sum==K){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
    //O(N)2
    public static int lenOfLongSubarrON2 (int arr[], int K) {
        //Complete the function
        int length=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                    sum=sum+arr[j];

                if(sum==K){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }

}
