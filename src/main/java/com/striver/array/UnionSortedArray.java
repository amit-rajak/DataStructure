package com.striver.array;

import java.util.ArrayList;


public class UnionSortedArray {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> list;
        list =UnionSorted(arr1,arr2);
        System.out.println(list);

    }

    private static ArrayList<Integer> UnionSorted(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();
          int i=0;
          int j=0;
          int SizeofFirstArray= arr1.length;
          int SizeofSecondArray= arr2.length;
          while(i < SizeofFirstArray && j < SizeofSecondArray){

              if(arr1[i]==arr2[j]){
                  if(list.size()>0 && list.get(list.size()-1)!=arr1[i]){
                      list.add(arr1[i]);
                  }
                  else if (list.size()==0){
                      list.add(arr1[i]);
                  }
                  i++;
                  j++;

              }else if(arr1[i]<arr2[j]){
                  if(list.size()>0 && list.get(list.size()-1)!=arr1[i]){
                      list.add(arr1[i]);
                  }
                  else if (list.size()==0){
                      list.add(arr1[i]);
                  }
                  i++;

              }
             else {
                  if(list.size()>0 && list.get(list.size()-1)!=arr2[j]){
                      list.add(arr2[j]);
                  }else if (list.size()==0){
                      list.add(arr2[j]);
                  }
                  j++;
              }
          }
          System.out.println( "i"+i +"j"+j );
        while (i<SizeofFirstArray)
        {
            if(list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while (j<SizeofSecondArray)
        {
            if(list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }

}
