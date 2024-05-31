package com.striver.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] sortedArray = {0, 3,4,4,5,5,9,11,};
        int newLength = removeDuplicates(sortedArray);

        for (int i = 0; i < newLength; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        // Prints: 1 2 3 4 5
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int newLength = 1; // Initialize the new length to 1, as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }

        return newLength;
    }


}
