package com.datastructure.Array;

import java.util.*;

public class TwoSumList {
    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 11, 9, 13, 8, 12};
        int target = 20;

        //System.out.println(Arrays.toString(new List[]{findPairs(nums, target)}));
        List<int[]> pairs = findPairs(nums, target);

        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }

    public static List<int[]> findPairs(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                result.add(new int[]{complement, num});
            }
            seen.add(num);
        }
        return result;
    }
}
