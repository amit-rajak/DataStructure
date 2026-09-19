package com.datastructure.Recursion.BeginRecuression.subsequence;

import java.util.ArrayList;
import java.util.List;

public class subsequenceSubset {
    public static void main(String[] args) {
        String str="abc";
        List<String> result=sequence("",str);
        System.out.println(result);
    }
    private static List<String> sequence(String p, String up) {
        if(up.isEmpty())
        {
            List<String> result = new ArrayList<>();
            result.add(p);

            return result;
        }
        char ch = up.charAt(0);
       List<String> left= sequence(p+ch,up.substring(1)); //takeit
       List<String> right= sequence(p,up.substring(1)); //ignore it

       left.addAll(right);
       return left;


    }
}
