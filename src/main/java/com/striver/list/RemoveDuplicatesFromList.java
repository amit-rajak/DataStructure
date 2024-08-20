package com.striver.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
        int newLength = RemoveDuplicatesFromList.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.println("Modified List: " + nums);
    }
    public static int removeDuplicates(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }

        int newLength = 1; // Initialize the new length to 1, as the first element is always unique

        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(i - 1))) { // Use .equals for Integer comparison
                nums.set(newLength, nums.get(i)); // Update the list at newLength index
                newLength++;
            }
        }

        // Remove the duplicates from the list
        for (int i = nums.size() - 1; i >= newLength; i--) {
            nums.remove(i);
        }

        return newLength;
    }
}
