package com.striver.Array;

public class SecondSmallAndLarge {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9,12};
        SecondLargeSecondSmall(arr,arr.length);
    }

    public static void SecondLargeSecondSmall(int arr[],int n)
    {
        int small= Integer.MAX_VALUE;
        int SecondSmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            small=Math.min(arr[i],small);
            large=Math.max(arr[i],large);

        }
        //System.out.println(large+"\n"+small);

        for(int j=0;j<n;j++)
        {
            if(arr[j]<SecondSmall && arr[j]!=small)
            {
                SecondSmall=arr[j];
            }

            if(arr[j]>secondLarge && arr[j]!=large)
            {
                secondLarge=arr[j];
            }
        }

        System.out.println("small value is: "+small +"\n"+
                "large value is: "+large +"\n "+
                "second small value is: "+SecondSmall +"\n"+
                "second Large value is: "+secondLarge +"\n"

        );



    }
}
