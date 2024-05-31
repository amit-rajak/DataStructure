package com.datastructure.Java8Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findMaxElement {
    public static void main(String[] args) {

      //  List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        FindCountOfEachCha("string data to count each character");

        int arr[]={10,15,8,49,25,98,32};
      int max=  Arrays.stream(arr).max().orElse(0);
      System.out.println(max);


        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max1 = myList.stream().max(Integer::compare).get();
        System.out.println(max1);




    }

    public static  void FindCountOfEachCha(String s){
        System.out.println("22. Write a program to print the count of each character in a String?");
        Map<String, Long> map=Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);

    }

    List<String> list1 = Arrays.asList("Java", "8");
    List<String> list2 = Arrays.asList("explained", "through", "programs");

    Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

    // Concatenated the list1 and list2 by converting them into Stream



}
