package com.datastructure.Array;

/*Explain:-

input:-10,15,18,19,30,4

output= 30-4
Max-Min*/

/*Time and Space Complexity Analysis:
        Time Complexity:
        O(n)

        A "for" loop is used to find the minimum and maximum values in the array; travelling the n sized array makes the time complexity O(n).

        SPACE COMPLEXITY:
        O(1)

        Since no extra space is used, therefore space complexity is constant.*/


public class SpanOfArray {
    public static void main(String[] args) {

        int arr[]={10,15,18,19,19,3,29,29,4};
        int max=arr[0];
        int min=arr[0];

        for (int i=0; i<arr.length;i++)
        {
            if(arr[i]>=max )
            {
                max=arr[i];
            }
            if(arr[i]<=min)
            {
                min=arr[i];
            }

        }
        System.out.print(max-min);

    }
}
