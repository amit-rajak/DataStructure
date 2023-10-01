package com.datastructure.Recursion.StringRecuresion;

public class CheckPandalirom {
    public static void main(String[] args) {
        String str="aba";
      System.out.println(ispalindrome(str,0,str.length()-1));
    }

    public static  boolean ispalindrome(String str,int l, int r)
    {
        if(l>=r)
        {
            return  true;
        }
        if(str.charAt(l)==str.charAt(r))
        {
            return ispalindrome(str,l+1,r-1);
        }
        return false;
    }
}
