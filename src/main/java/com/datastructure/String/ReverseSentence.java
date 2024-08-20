package com.datastructure.String;

import java.lang.reflect.Array;

public class ReverseSentence {
    public static void main(String[] args) {
        String str="i like this program very much";
        String string="i.like.this.program.very.much";

      System.out.println(reverse(str));
      System.out.println(reverse1(string));

    }

    public static String reverse(String str) {
       String result ="";
        String arr[] = str.split(" ");
        for(int i=arr.length-1 ;i>=0;i--){
            result+=arr[i]+" ";
        }
        return result.trim();
    }
    public static String reverse1(String str) {
        String result ="";
        String arr[] = str.split("\\.");
        for(int i=arr.length-1 ;i>=0;i--){
            result+=arr[i];
            if(i>0){
                result+=".";
            }
        }
        return result;
    }
}
