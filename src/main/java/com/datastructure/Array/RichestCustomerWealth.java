package com.datastructure.Array;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
    int arr[][]={
            {2,8,7},
            {7,1,3},
            {1,9,5}
            /*{1,2,3},
            {3,2,1}*/
    };

    System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int max=0;
       int row= accounts.length;
       int col= accounts[0].length;
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum+=accounts[i][j];
            }

            if(sum>=max)
            {
                max=sum;
            }

        }

        return max;

    }
}
