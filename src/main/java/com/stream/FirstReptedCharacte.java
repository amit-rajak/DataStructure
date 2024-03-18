package com.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReptedCharacte {
    public static void main(String[] args) {

        String input = "Java Articles are Awesome";

         Character firstRepeted=input.chars()
                 .mapToObj(s-> (char) s)
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry->entry.getValue()>1)
                 .map(entry -> entry.getKey())
                 .findFirst().get();

         System.out.println(firstRepeted);

    }
}
