package com.datastructure.test;

public class Occurence {
    public static void main(String[] args) {

        int[] array = {-21, -2, 1, 5, 7, 7, 7, 7, 10, 10, 10, 10, 23};
        int element= 10;
       //

       int ans=elementOccurence(array,element,true);

        System.out.println(ans);
        int ans1=elementOccurence2(array,element);
        System.out.println(ans1);

    }

    public  static int elementOccurence(int array[],int eleement,boolean firstIndex)
    {
        int ans=-1;
        int start=0;
        int end=array.length-1;


        while(start<=end)
        {
            int mid= start+(end-start)/2;

            if(eleement<array[mid])
            {
                end=mid-1;
            }
            else if(eleement>array[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(firstIndex==true)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }

        return ans;
    }

    public  static  int elementOccurence2(int arrry[],int element)
    {
        for(int i=0;i<arrry.length;i++)
        {
            if(arrry[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
}
