package com.datastructure.Recursion.BeginRecuression.easy;

public class PrintNumber {
    public static void main(String[] args) {
        print(0);
        System.out.println("\n");
        printOpposite(0);
        System.out.println(factorial(5));
    }
    public static void print(int num){
        if(num > 5)
        {
            return;
        }
        System.out.println(num);
        print(num+1);
    }


    public  static  void  printOpposite(int num1){

        if(num1>5){
            return;
        }
        System.out.println(num1);
        printOpposite(num1+1);
        System.out.println(num1);

    }


    public  static int  factorial(int num){
        if(num==1){
            return 1;
        }

        return num * factorial(num-1);
    }
}
