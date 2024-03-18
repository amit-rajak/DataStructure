package com.datastructure.Java8Stream;

import java.util.Arrays;
import java.util.List;

public class findMaxElement {
    public static void main(String[] args) {

      //  List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        int arr[]={10,15,8,49,25,98,32};
      int max=  Arrays.stream(arr).max().orElse(0);
      System.out.println(max);
    }
}
