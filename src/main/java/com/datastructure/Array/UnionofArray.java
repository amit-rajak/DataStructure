package com.datastructure.Array;

import java.util.ArrayList;
import java.util.List;

public class UnionofArray {
    public static void main(String[] args) {
        int arr1[] = {1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
      int result[] = intersectionArray(arr1,arr2);
      for(int i=0;i<result.length;i++){
          System.out.println(result[i]);
      }
    }
    public static int[] intersectionArray(int[] nums1, int[] nums2) {

        List<Integer> union= new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){

                if(union.size()==0 || !union.get(union.size()-1).equals(nums1[i])){
                    union.add(nums1[i]);
                }
                i++;
            }
            else {
                if(union.size()==0 || !union.get(union.size()-1).equals(nums2[j])){
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(!union.get(union.size()-1).equals(nums1[i])){
                union.add(nums1[i]);
            }
            i++;
        }
        while(j<m){
            if(!union.get(union.size()-1).equals(nums2[j])){
                union.add(nums2[j]);
            }
            j++;
        }
      System.out.println("data of union"+union);
        //convert in array
        int[] result = new int[union.size()];
        for(int k=0;k<union.size();k++){
            result[k]=union.get(k);

        }
        return result;

    }
}

