package com.Pratice;


public class ThirdLargestElement {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};
        int large= SecondLarge(arr);
        System.out.println(large);
    }

    public static int SecondLarge(int arr[]){

        int largest= Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        int SecondSmallest=Integer.MAX_VALUE;
        int thirdSmallest= Integer.MAX_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            largest=Math.max(arr[i],largest);
            smallest=Math.min(arr[i],smallest);

        }
       for(int i=0;i<arr.length;i++){
           if(arr[i]>SecondLargest && arr[i]!=largest)
           {
               SecondLargest=arr[i];
           }
           if(arr[i]<SecondSmallest && arr[i]!=smallest)
           {
               SecondSmallest=arr[i];
           }
       }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>thirdLargest  && arr[i]!=SecondLargest && arr[i]!=largest)
            {
                thirdLargest=arr[i];
            }
            if(arr[i]<thirdSmallest && arr[i]!=SecondSmallest && arr[i]!=smallest)
            {
                thirdSmallest=arr[i];
            }
        }


        return thirdLargest;
    }
}
