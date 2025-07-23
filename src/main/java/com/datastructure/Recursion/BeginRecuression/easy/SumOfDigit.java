package com.datastructure.Recursion.BeginRecuression.easy;

public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(sum(1342));

    }

    public static int sum(int num)
    {
        if(num ==0)
        {
            return num;
        }

        return num%10 + sum(num/10);
    }
}
