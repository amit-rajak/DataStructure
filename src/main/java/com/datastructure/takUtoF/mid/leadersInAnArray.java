package com.datastructure.takUtoF.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leadersInAnArray {

    public static void main(String[] args) {
        int arr[]={-3, 4, 5, 1, -4, -5};
        System.out.println(Arrays.toString(leaders(arr)));
    }
    public static int[] leaders(int[] nums) {
        //brutefource
        List<Integer> list = new ArrayList<>();
        int max = nums[nums.length - 1];
        list.add(max);
        for (int i = nums.length - 1 - 1; i > 0; i--) {
            System.out.println("valuof i" + nums[i]);
            if (max < nums[i]) {
                list.add(nums[i]);
                max = nums[i];

            }
        }
        int[] array = new int[list.size()];
        System.out.println(list);
        int data=0;
        for (int j = list.size()-1; j >= 0; j--) {
            array[data] = list.get(j);
            data++;

        }
        return array;
    }}