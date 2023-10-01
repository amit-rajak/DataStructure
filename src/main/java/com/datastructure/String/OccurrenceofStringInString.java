package com.datastructure.String;

public class OccurrenceofStringInString {
    public static void main(String[] args) {

        System.out.println(count("ababbabacaba","aba"));
    }
    public static int count(String str,String target)
    {
       int count=CountHelper(str,target, 0);
               return count;
    }
    public static int CountHelper(String str,String target,int i)
    {
        if(i>str.length()- target.length())
        {
            return 0;
        }
        int helperCount=CountHelper(str,target,i+1);

        boolean answermatch=str.substring(i,i+target.length()).equals(target);
        if (answermatch)
        {
            return helperCount+1;
        }
        else
        {
            return helperCount;
        }
    }
}
