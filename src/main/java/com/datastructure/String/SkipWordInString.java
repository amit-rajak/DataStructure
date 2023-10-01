package com.datastructure.String;

public class SkipWordInString {
    public static void main(String[] args) {
        System.out.println(skipWord("bacapplecad"));
    }
    public static String skipWord(String OriginalString)
    {
        if(OriginalString.isEmpty())
        {
            return "";
        }


        if(OriginalString.startsWith("apple"))
        {
            return skipWord(OriginalString.substring(5));
        }
        else {
            return OriginalString.charAt(0)+skipWord(OriginalString.substring(1));
        }
    }
}
