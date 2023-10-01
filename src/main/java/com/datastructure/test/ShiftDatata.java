package com.datastructure.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShiftDatata {

    public static void main(String[] args) {

        int arr[]={-6,1,2,5,-1,-8};
        //-8,-1,1,2,5

      int sorteddata[]=  Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n->n<0))
                .values()
                .stream()
                .flatMap(list->list.stream())
                .mapToInt(Integer::intValue).toArray();

      Arrays.stream(sorteddata).forEach(System.out::println);

    }



}
