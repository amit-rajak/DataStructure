package com.datastructure.Array;

/*input:1,2,3,4

         *
      *  *
   *  *  *
*  *  *  **/

public class Barchart {


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,9,8};
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        for(int floor =max;floor>=1;floor--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=floor)
                {
                    System.out.print("*  ");

                }
                else
                {
                    System.out.print ("  ");
                }

            }
            System.out.println();

        }
    }

}
