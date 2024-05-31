package com.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, find the first non-repeated character in it using Stream functions?
public class FindFirstNonrepatedChar {
    public static void main(String[] args) {

        String input = "Java articles are Awesome";

        Character result=input.chars()
                        .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                         .entrySet()
                         .stream()
                         .filter(entryset-> entryset.getValue()==1)
                          .map(entryset->entryset.getKey())
                            .findFirst().get();



        System.out.println(result);
    }
}
