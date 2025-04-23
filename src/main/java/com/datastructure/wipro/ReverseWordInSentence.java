package com.datastructure.wipro;


public class ReverseWordInSentence {

    public static void main(String[] args) {
        String str = "My name is Amit";
        // ym eman si timA
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        String originalResult = "";
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            originalResult = originalResult + swap(arr[i]) + " ";
        }
        return originalResult.trim();
    }
    public static String swap(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
