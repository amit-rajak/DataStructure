package com.Test;


import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CamelCaseConverterStream {

    public static String toCamelCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
       // AtomicInteger index = new AtomicInteger(0);

        return Arrays.stream(words)
                .map(word -> {
                    String s = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                    return s;
                })
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String input = "hello world amit";
        String result = toCamelCase(input);
        System.out.println(result); // Output: "hello World Amit"
    }
}
