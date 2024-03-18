package com.Test;

public class Pattern {
    public static void main(String[] args) {

        int length=5;
        // int i=0;

            for( int i=0;i<length;i++)
            {


                for(int j=0;j<i;j++)
                {
                   System.out.print(" ");
                }

                for(int k=0;k<length-i;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }



        }
    }

