package com.interview.questions.java;

public class StockbuySell {

    public static void main(String[] args) {

        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int maxprof=0;
        int minprof=prices[0];

        for(int i=1;i<prices.length-1;i++)
        {
            maxprof= Math.max(maxprof,prices[i]-minprof);
            minprof= Math.min(prices[i],minprof);
        }

        return maxprof;
    }
}

