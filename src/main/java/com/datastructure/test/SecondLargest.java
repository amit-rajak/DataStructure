package com.datastructure.test;

import java.util.Collections;
import java.util.List;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

    public static void main(String[] args) {
        List<Integer> secondLar = Arrays.asList(4, 17, 23, 19, 27);
        SecondLargest sc = new SecondLargest();
        Optional<Integer> secondLargest = sc.sec_Lar(secondLar);
        secondLargest.ifPresentOrElse(
                num -> System.out.println("The second largest number is: " + num),
                () -> System.out.println("No second largest number found")
        );
    }

    public Optional<Integer> sec_Lar(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();
}}
