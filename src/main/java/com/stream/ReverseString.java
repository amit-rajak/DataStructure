package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str= "my name is Amit";
        List<String> words = Arrays.asList(str.split(" "));
          Collections.reverse(words);
        String result= words.stream().collect(Collectors.joining(" "));
        System.out.println(result);


        //Reversse Word by Word
    String data=   Arrays.stream(str.split(" ")).map(m-> new StringBuilder(m).reverse().toString())
               .collect(Collectors.joining(" "));


            System.out.println(data);
    }
}
