package com.datastructure.Java8Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElements {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(10,15,8,49,25,98,98,32,15,32);
        Set<Integer> set = new HashSet();
        list.stream().
                filter(n->!set.add(n))
                .forEach(System.out::println);
    }
}
