package com.datastructure.SubString;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationsClass {
    public static void main(String[] args) {

        List <String> list= new ArrayList<>();
        list= pad("","12",new ArrayList<>());
        System.out.println(list);

    }



    public static  List<String> pad(String p, String up,  ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add((String) p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into  2

        for(int i= (digit-1)*3;i<digit*3;i++)
        {
            char ch=(char) ('a'+ i);
            pad(p + ch,up.substring(1),list);
        }


        return list;
    }
}
