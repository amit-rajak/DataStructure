package com.datastructure.String;

public class FirstCharStringElement {
    public static void main(String[] args) {

        //one type
        String[] str ={"Amit","Anita","kumar","Ali"};
        String firstElement="A";
        for (String s : str) {
            if (s.startsWith("A") || s.startsWith("a")) {
                System.out.println(s);
            }
        }
         // second type
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            if (s.length() > 0 && (s.charAt(0) == 'A' || s.charAt(0) == 'a')) {
                System.out.println("other method "+s);
            }
        }
    }




}
