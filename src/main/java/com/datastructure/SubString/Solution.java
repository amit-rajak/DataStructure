package com.datastructure.SubString;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findSubstrings("abc"));
    }

    public static ArrayList<String> findSubstrings(String s) {
        ArrayList<String> substrings = new ArrayList<>();
        Suseq("", s, substrings);
        Collections.sort(substrings);
        return substrings;
    }


    public static List<String> Suseq(String p, String up,  ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        Suseq(p + ch, up.substring(1), list);
        Suseq(p, up.substring(1), list);
        return list;
    }
}



