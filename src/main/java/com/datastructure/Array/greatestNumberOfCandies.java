package com.datastructure.Array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class greatestNumberOfCandies {
    public static void main(String[] args) {

        int arr[]={2,3,5,1,3};


        List<Boolean> data= new ArrayList<Boolean>();
        data=  kidsWithCandies(arr,3);
        System.out.println(data);

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> data= new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length-1;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
      //  int candi=max+extraCandies;
        //System.out.println(candi);
        for(int j=0;j<candies.length-1;j++)
        {
            if(candies[j]+extraCandies>=max)
            {
                data.add(true);
            }
            else
            {
                data.add(false);
            }
        }
        return data;
    }
}

