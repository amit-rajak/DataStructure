package com.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        String[] str = {"I", "AM", "LONGEST", "WORD"};

        Arrays.stream(str)
                .sorted(Comparator.comparing(String::length).reversed()) // Sort by length in descending order
                .map(s -> s.length() + ":" + s) // Map to length:word format
                .forEach(System.out::println); // Print each word with its length
    }




    }

