package com.Test;

import java.util.ArrayList;
import java.util.List;

public class uniquepermutations {
    public static void main(String[] args) {

        int arr[]={10, 9, 2, 5, 3, 7, 101, 18};
        //[2, 3, 7, 101]
        System.out.println(longestSubsequence(arr));
    }

    public  static List<Integer> longestSubsequence(int[] arr)
    {
        List<Integer> list= new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
          for(int j=1;j<arr.length;j++)
          {
              if(arr[i]<arr[j])
              {
                  list.add(arr[i]);
              }
          }
      }
        return list;
    }
/*
ABC
""+a
a



 */
    //3.Write a java code to produce ABC,ACB,BAC,BCA CAB, CBA like all possible unique permutations of a given string ABC ?

    public  static  void Pemuatation(String str ,String uproceress)
    {
        List arraylist=new ArrayList();
        if(str.isEmpty())
        {
            return;
        }
        char s= uproceress.charAt(0);
            Pemuatation(str,uproceress+s);

    }
}
