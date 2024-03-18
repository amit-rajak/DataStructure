package com.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "Java articles are Awesome";


        String input = "Java articles are Awesome";
        List<Character>NoreptingChar= new ArrayList<>();
       // NoreptingChar=input.chars()
        Character result = input.chars() // Stream of String
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .filter(entry->entry.getValue()==1)
                                                .map(entry->entry.getKey())
                                                       // .collect(Collectors.toList()); //print all no reprting cha
                                                        .findFirst().get();
        System.out.println(result);
        //System.out.println(NoreptingChar);
    }}
