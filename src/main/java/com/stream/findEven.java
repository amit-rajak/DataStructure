package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEven {

    public static void main(String[] args) {
        int arr[]={10,15,8,49,25,98,32};

        //List<Integer> arrayList=  Arrays.asList(10,15,8,49,25,98,32);
        // ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
         ArrayList<Integer> arrayList = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

       //collect
  int sum=      arrayList.stream() .filter(n -> n%2 == 0)
                 .mapToInt(m->m*m)// Square of even no
                .sum();// sum of all Square even num;

              //  .forEach(System.out::println);
           System.out.println(sum);
    }



}
