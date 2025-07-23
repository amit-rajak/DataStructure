package com.datastructure.Recursion.BeginRecuression.easy;

public class PrintTheNumber {

    public static void main(String[] args) {

      print1(0);

    }

    public static  void print1(int n){

        if(n==10){return;}
        System.out.println(n);
        print1(n+1);


    }
}
