package com.datastructure.SubString;

public class CountAllSubstring {
    public static void main(String[] args) {
        String s = "Kincenvizh";
       System.out.println(countNonEmptySubstr(s)) ;
    }




    static int countAllSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int left = 0; left < n; left++) {
            for (int right = left + 1; right <= n; right++) {
                String substring = s.substring(left, right);
                System.out.println(substring);
                count++;
            }
        }
        return count - 1; // Subtract 1 to exclude the empty string as a substring
    }


    static int countNonEmptySubstr(String str)
    {
        int n = str.length();
        return n * (n + 1) / 2;
    }
}