package com.datastructure;

import java.util.ArrayList;

public class PrintVowel {
    /*identify the vowels in the given string and reverse the vowels in the same string.

i/p: orange in the basket

o/p: erange in the baskot


for your reference
vowels in the input string: o,a,e,i,e,a,e
reversed vowels: e,a,e,i,e,a,o

has context menu*/

    public static void main(String[] args) {


        String str="orange in the basket";
        ArrayList list = new ArrayList();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }

        list.stream().filter(st->st.equals('o'));

    }
    //Array Rotation
    //i/p [1,2,3,4,5,6,7]
    //i/p: n = 3
    //o/p: [5,6,7,1,2,3,4]
    //ex:
    //1st rotation = [7,1,2,3,4,5,6]
    //2nd rotation = [6,7,1,2,3,4,5]
    //3rd rotation = [5,6,7,1,2,3,4]



}
