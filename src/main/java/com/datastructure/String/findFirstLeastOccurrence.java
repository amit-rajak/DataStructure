package com.datastructure.String;

import java.util.HashMap;

public class findFirstLeastOccurrence {
    public static void main(String[] args) {
        String str = "tswiss";
        char result = findFirstLeastOccurrence(str);

        if (result != '0') {
            System.out.println("First character with least occurrence: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }

    public static char findFirstLeastOccurrence(String str){

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(char c :str.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        char result = '\0';
        int minCount = Integer.MAX_VALUE;

        for (char c : str.toCharArray()) {
            int count = charCountMap.get(c);
            if (count < minCount) {
                minCount = count;
                result = c;
            }
        }

        return result;
    }
}
