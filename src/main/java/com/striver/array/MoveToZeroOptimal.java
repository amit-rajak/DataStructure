package com.striver.array;

import java.util.Arrays;


public class MoveToZeroOptimal {
    public static void main(String[] args) {
        int arr[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        //Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

        System.out.println(Arrays.toString(moveZeroEnd(arr)));
    }


    public static int[] moveZeroEnd(int a[])
    {
        /*int j=-1;
        for(int i=0;i<arr.length;i++ )
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
            }
        }*/
        // code here
        int j=-1;
        for(int i=a.length-1;i>0;i--){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j;i>=0;i--){
            if(a[i]!=0){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                j--;
            }
        }


        return a;
    }


}
