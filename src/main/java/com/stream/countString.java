package com.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countString {
    public static void main(String[] args) {
        String [] str= {"Spring","java","rubby","struct","spring","python"};
       Map<String,Long> map=Arrays.stream(str)
                       .map(String::toLowerCase)
                       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                      // System.out.println(map);

        for(Map.Entry<String ,Long> entry : map.entrySet()){
            if(entry.getKey().equalsIgnoreCase("Spring")){
                System.out.println("Key :"+entry.getKey() +"  value:"+ entry.getValue());
            }

        }
    }
}
