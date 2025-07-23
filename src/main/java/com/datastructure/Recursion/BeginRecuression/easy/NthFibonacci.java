package com.datastructure.Recursion.BeginRecuression.easy;

public class NthFibonacci {


    public static void main(String[] args) {

        System.out.println(fib(6));

        for (int i = 0; i <= 6; i++) {
            System.out.print(fib(i) + " ");
        }

    }

    public static int fib(int num)
    {

        if(num< 2){
            return num ;
        }
        return fib(num-1) +fib(num-2);


    }


}
