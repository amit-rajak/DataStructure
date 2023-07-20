package com.datastructure.Array;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);

        List<Integer> Printlist=   ReverseList(list);
        System.out.print(Printlist);


    }

    static  List<Integer>  ReverseList(List<Integer> list)
    {
        int start=0;
        int end=list.size()-1;
       while(start<end)
       {
           swap(list,start,end);
           start++;
           end--;

       }
        return list;
    }

    private static void swap(List<Integer> list, int start, int end) {

        int temp= list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);

    }


}
