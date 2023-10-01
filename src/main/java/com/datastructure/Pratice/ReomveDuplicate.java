package com.datastructure.Pratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ReomveDuplicate {

    public static void main(String[] args) {
        String str="aabcdcefc";
        removeChar(str);

       char str1[]="aabcdcefc".toCharArray();
       removeChar2(str1);
    }

    public static void removeChar(String str)
    {
        int n=str.length();
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        for(int i=0;i<str.length();i++) {
            s.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (char ch : s) {
            result.append(ch);
        }
        System.out.println(result);
    }

    /// method 2
    public static void removeChar2(char str[])
    {
        int n=str.length;
        HashSet<Character> s1 = new LinkedHashSet<>(n - 1);
        for(int i=0;i<str.length;i++) {
            s1.add(str[i]);
        }
//        StringBuilder result = new StringBuilder();
//        for (char ch : s) {
//            result.append(ch);
//        }
        System.out.println(s1);
    }
}
