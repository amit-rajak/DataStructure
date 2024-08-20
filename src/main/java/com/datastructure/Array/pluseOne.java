package com.datastructure.Array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

class pluseOne {

    public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 2, 7, 2, 8, 4, 4, 3, 4));
        //{3, 7, 2, 7, 2, 8, 4, 4, 3, 4},
        System.out.println(increment(list, list.size()));
    }
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // Convert ArrayList to a BigInteger
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i));
        }

        // Create BigInteger from the string representation
        BigInteger result = new BigInteger(sb.toString());

        // Increment the number by 1
        result = result.add(BigInteger.ONE);

        // Convert the result back to an ArrayList of digits
        ArrayList<Integer> digitList = new ArrayList<>();

        // Convert BigInteger to string and then to digits
        String resultStr = result.toString();
        for (char c : resultStr.toCharArray()) {
            digitList.add(Character.getNumericValue(c));
        }

        return digitList;
    }
}
