package com.datastructure.Recursion.BeginRecuression.subsequence;

public class skipWord {

    public static void main(String[] args) {

        String str = "abjdhfjapplenbdcnapple";

        System.out.println(skipword(new StringBuilder(),str,0));
    }

    private static StringBuilder skipword(StringBuilder result, String str, int index) {

        if(index==str.length()){
            return result;
        }
        if(str.startsWith("apple",index))
        {
            return skipword(result,str,index+5);
        }else{
            result.append(str.charAt(index));
        return skipword(result,str,index+1);}
    }
}
