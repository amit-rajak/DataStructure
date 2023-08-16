package com.datastructure.Array;

public class InPlaceArrayTransformation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = transformArrayInPlace(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] transformArrayInPlace(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[nums[i]];
        }

        return nums;
    }
}
