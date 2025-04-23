package com.datastructure.takUtoF.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -1, -3, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                positive.add(nums[i]);
                System.out.println(i);
            }
            else{
                negative.add(nums[i]);
            }
        }

        // Rearrange the numbers alternately using a for loop
        int posIndex = 0, negIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
               // System.out.println(positive.get(posIndex++));
                nums[i] = positive.get(posIndex);
                posIndex++;

            } else {
                nums[i] = negative.get(negIndex);
                negIndex++;
            }
        }
        return nums;
    }
}
