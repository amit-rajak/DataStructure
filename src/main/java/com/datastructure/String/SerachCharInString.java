package com.datastructure.String;

/*input:- "Amit kumar";
target ='k';*/

public class SerachCharInString {
    public static void main(String[] args) {
        String str="Amit kumark";
        int target='P';   // Pass Input here
        findCharInString(str,target);
    }

    private static void findCharInString(String str, int target) {

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i))==target)
            {
                System.out.println(i);
                count++;

            }

        }
        if(count<=0)
        System.out.println(-1);
    }
}


