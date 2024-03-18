package com.Test;


/* 1.From string fing out first non repeated character.


2.find out odd even numbers from [7,13,17,8]
Expected output:
{false=[7, 13, 17], true=[8]}*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodeTest {

    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        list.add(7);
        list.add(13); list.add(17);
        list.add(8);

      List evenNo=  list.stream().filter(l->l%2==0).collect(Collectors.toList());
        List oddNo=  list.stream().filter(l->l%2!=0).collect(Collectors.toList());

        //System.out.println(evenNo);
        System.out.println(oddNo);



        //No repetedCharacter

        //Input=
        String s= "amit";






    }


}
