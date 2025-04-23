package com.datastructure.Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //int[] sortedArray = {1, 3,4,4,5,5,9,11,};
        int[] sortedArray =  {0, 0, 3, 3, 5, 6};
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
        int newLength=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[newLength]=nums[i];
                newLength++;
            }
        }
        return newLength;

    }
}
