package com.striver.array;

public class CountString {


    public static void main(String[] args) {

        String input = "aabbccaddeefab";


        StringBuilder output = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (i+1<input.length()&&input.charAt(i + 1) == currentChar) {
                count++;
            } else {
                output.append(currentChar);
                output.append(count);
                count = 1;
            }


        }
        System.out.println("here "+output.toString());

    }}





