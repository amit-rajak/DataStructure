package com.stream;

import java.util.Arrays;

public class NumberStartingWithOne {

    public static void main(String[] args) {
        int arr[]={10,15,8,49,25,98,32};

        Arrays.stream(arr).mapToObj(s->s+"").filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }

}
