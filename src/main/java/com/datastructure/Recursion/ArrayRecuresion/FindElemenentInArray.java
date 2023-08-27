package com.datastructure.Recursion.ArrayRecuresion;

import java.util.ArrayList;
import java.util.List;

public class FindElemenentInArray {
    public static void main(String[] args) {

        int arr[]={10,12,23,18,18,20};
        int target=18;
        System.out.println(findTragetIndex(arr,target,0));
        System.out.println(findTraget(arr,target,0));

        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndexFrom(arr,target,0));

    }
    // Find Index
    public static int  findTragetIndex(int arr[], int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return findTragetIndex(arr,target,index+1);
        }
    }

    //is data is present or not
    public static boolean  findTraget(int arr[], int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        if(arr[index]==target)
        {
            return true;
        }
        else
        {
            return findTraget(arr,target,index+1);
        }
    }

    // find All index

    public  static ArrayList<Integer> findAllIndex(int arr[], int target, int index, ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }


            return findAllIndex(arr,target,index+1,list);

    }
// Find All Index
public  static ArrayList<Integer> findAllIndexFrom(int arr[], int target, int index)
{
    ArrayList<Integer> list= new ArrayList<>();
    if(index==arr.length)
    {
        return list;
    }
    if(arr[index]==target)
    {
        list.add(index);
    }


    ArrayList<Integer> FindAllListDataFromResurciveStack= findAllIndexFrom(arr,target,index+1);
     list.addAll(FindAllListDataFromResurciveStack);
      return list;

}

}
