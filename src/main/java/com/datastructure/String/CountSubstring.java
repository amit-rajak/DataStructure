package com.datastructure.String;

public class CountSubstring {
    public static void main(String[] args) {

            System.out.println(countSub("bacappleapplecadapp"));


    }
    public static int countSub(String OriginalString)
    {    int count=0;
        if(OriginalString.isEmpty())
        {
            return 0;
        }


        if(OriginalString.startsWith("app"))
        {
            count =count+countSub(OriginalString.substring(3));
        }
        else {
            count =count+ OriginalString.charAt(0)+countSub(OriginalString.substring(1));
        }
        return count;
    }
}
