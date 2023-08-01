package com.datastructure.BinarySerch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreaterElement {

    public static void main(String[] args) {
        char arr[]={'x','x','y','y'};// output will x
        char target='z';
        char ans=nextGreatestLetter(arr,target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;

        while(end>=start)
        {
            int mid=start+(end-start)/2;

            if(target<letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }


        }
        return letters[start%letters.length];

    }
}
