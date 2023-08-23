package com.datastructure.Recursion;

public class ProductOfDegit {
    public static void main(String[] args) {
       int ans= product(1);
     System.out.println(ans);
    }

    public static int product(int i) {
        if(i%10==i)
        {
            return i;
        }
        return (i%10)*product(i/10);
    }
}
