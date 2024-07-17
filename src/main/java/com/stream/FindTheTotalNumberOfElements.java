package com.stream;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count= myList.stream().count();
        System.out.println(count);

        //sum of all num
        long sum= myList.stream().mapToLong(Integer::longValue).sum();
        System.out.println(sum);

        // even and odd
        myList.stream();

}}
