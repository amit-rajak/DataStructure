package com.Test;


/*
2.Given an array of integers, write a Java function to find the maximum difference between any two elements such that the larger element appears after the smaller element in the array. In other words, find the maximum "buy and sell" profit if the elements of the array represent stock prices on different days. For example, given the array [7, 1, 5, 3, 6, 4], the maximum difference is 5, which corresponds to buying on day 2 (price = 1) and selling on day ­­5 (price = 6). Your task is to implement a Java function that finds and returns this maximum difference. Make sure to handle cases where no profit can be obtained as well.
 */
public class MaxProfit {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,20,4,14};
        System.out.println(maxProfitM(arr));
    }

    public static int maxProfitM(int[] prices) {

        int maxprof=0;
        int minprof=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            maxprof= Math.max(maxprof,prices[i]-minprof); //  0,(1-7)=0,
            minprof= Math.min(prices[i],minprof); //1,7=1
        }

        return maxprof;
    }

    }

