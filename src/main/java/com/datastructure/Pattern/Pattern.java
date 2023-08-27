package com.datastructure.Pattern;

       /*

        *
        * *
        * * *
        * * * *
*/
public class Pattern {
    public static void main(String[] args) {
        System.out.println("===================Print1"+"=========================");
        print1(4);
        System.out.println("===================Print2"+"=========================");
        print2(4);
        System.out.println("===================Print3"+"=========================");
        print3(4);
        System.out.println("===================Print4"+"=========================");
        print4(4);
        System.out.println("===================Print5"+"=========================");
        print5(4);
    }

    public static void print1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for (int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
           public static void print2(int n)
           {
               for(int row=1;row<=n;row++)
               {
                   for (int col=1;col<=n;col++)
                   {
                       System.out.print("* ");
                   }
                   System.out.println();
               }

           }
           public static void print3(int n)
           {
               for(int row=n;row>=1;row--)
               {
                   for (int col=1;col<=row;col++)
                   {
                       System.out.print("* ");
                   }
                   System.out.println();
               }

           }
           public static void print4(int n)
           {
               for(int row=1;row<=n;row++)
               {
                   for (int col=1;col<=row;col++)
                   {
                       System.out.print(col +" ");
                   }
                   System.out.println();
               }

           }

           public static void print5(int n)
           {
               for(int row=0;row<=n*2;row++)
               {
                   int totalrowcol=row > n ? 2*n-row : row;
                   for (int col=0;col<totalrowcol;col++)
                   {
                       System.out.print("* ");
                   }
                   System.out.println();
               }

           }
}
