package com.datastructure.Pattern;

public class PrintPattern {

    public static void main(String[] args) {

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }

        //pattern 2
        System.out.println("pattern 2");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("pattern 3");

        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("pattern 4");

        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }

        System.out.println("pattern 5");

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("pattern 6");

        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("pattern 7");

        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("pattern 8");

        for(int i=0;i<5;i++)
        {
            //print space
            for(int j=0;j<5-i-1;j++)
            {
                System.out.print(" ");
            }
            //print star
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            //print space
            for(int j=0;j<5-i-1;j++)
            {
                System.out.print(" ");
            }

            System.out.println();

        }
        System.out.println("pattern 9");

        for(int i=0;i<5;i++)
        {
            //print space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //print star
            for(int k=0;k<2*5-(2*i+1);k++)
            {
                System.out.print("*");
            }
            //print space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();

        }

    }
}
