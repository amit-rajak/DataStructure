package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCheck {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Set<Integer> set= new HashSet<>(list);

        if(list.size()==set.size())
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }

    }


}
