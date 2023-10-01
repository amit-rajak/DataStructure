package com.datastructure.String;

public class RemoveElementFromString {
    public static void main(String[] args) {
      skip("","baccad");

      System.out.println(skip1("baccad"));


    }

    public static void skip(String ProcessedString,String OriginalString)
    {
        if(OriginalString.isEmpty())
        {
            System.out.println(ProcessedString);
            return;
        }

        char ch=OriginalString.charAt(0);
        if(ch=='a')
        {
            skip(ProcessedString,OriginalString.substring(1));
        }
        else {
            skip(ProcessedString + ch, OriginalString.substring(1));
        }
    }

    //Method 2
    public static String skip1(String OriginalString)
    {
        if(OriginalString.isEmpty())
        {
            return "";
        }

        char ch=OriginalString.charAt(0);
        if(ch=='a')
        {
           return skip1(OriginalString.substring(1));
        }
        else {
            return ch+skip1(OriginalString.substring(1));
        }
    }
}
