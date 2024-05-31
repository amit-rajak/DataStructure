package com.striver.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepatingChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome".toLowerCase();
       char result= nonRepChar(input);
       System.out.println(result);
    }

    public static char nonRepChar(String input){
        LinkedHashMap<Character,Integer> linkedHashMap= new LinkedHashMap();
        char[] str =input.toCharArray();
        int freq=0;
       for(int i=0;i<str.length;i++){
           if(linkedHashMap.containsKey(str[i])){
               linkedHashMap.put(str[i],linkedHashMap.get(str[i]) + 1);
           }else{
               linkedHashMap.put(str[i],1);
           }
       }

       for(Map.Entry<Character,Integer> entry:linkedHashMap.entrySet()){

           if(entry.getValue()==1){
              // System.out.println(entry.getKey());
               char result=entry.getKey();
               return result;
           }
       }

        return 0;
    }
}
