package com.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindduplicateNumber {
    public static void main(String[] args) {

        
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set =new HashSet<>();
        myList.stream().filter(n->!set.add(n))
                .forEach(System.out::println);

        String str1 = "Java Concept Of The Day";
        String reversedStr = Stream.of(str1)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining());

    }
}
