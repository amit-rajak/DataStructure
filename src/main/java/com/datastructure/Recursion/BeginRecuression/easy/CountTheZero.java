package com.datastructure.Recursion.BeginRecuression.easy;

public class CountTheZero {
    public static void main(String[] args) {

        System.out.println(countZero(3020100));

    }



    public static int countZero(int num)
    {
        return helper(num,0);
    }

    public static int helper(int num,int count)
    {
        if(num==0)
        {
            return count;
        }

        int rem = num % 10;
        if(rem==0)
        {
            return helper(num/10,count+1);

        }
        else
        {
            return helper(num/10,count);
        }


    }
}
