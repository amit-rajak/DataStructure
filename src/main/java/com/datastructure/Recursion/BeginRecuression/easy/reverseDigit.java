package com.datastructure.Recursion.BeginRecuression.easy;

public class reverseDigit {

    public static void main(String[] args) {

        //System.out.println(revDigit(123456));
        System.out.println();
        revDigit2(123456);

    }

    private static int revDigit(int num) {

        return helper(num, 0);

    }
    private static int helper(int num, int rev)
    {
        if(num==0)
        {
            return rev;
        }

        return helper(num/10,rev*10+num%10);

    }



        private static void revDigit2(int num)
        {
            if(num==0)
            {
                return ;
            }



            int rem = num%10;
            System.out.print(rem);
            revDigit2(num/10);


        }
}
