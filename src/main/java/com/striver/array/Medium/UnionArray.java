package com.striver.array.Medium;

import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,1,2, 3, 4, 5, 6, 7, 8, 9, 10,20};
        int arr2[] = {1,2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> list = Union(arr1, arr2);

        for(int u:list) {
            System.out.println(u);
        }
    }

    public static ArrayList<Integer> Union(int arr1[], int arr2[]){

        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer > Union=new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) { //case 1 2
                if(Union.size()>0 && Union.get(Union.size()-1)!=arr1[i]) {
                    Union.add(arr1[i]);
                } else if (Union.size()==0) {
                    Union.add(arr1[i]);
                }
                i++;j++;
            } /*else if (Union.size()>0 && arr1[i] < arr2[j]) {///case 2
                if(Union.get(Union.size()-1)!=arr1[i]) {
                    Union.add(arr1[i]);
                }
                else if (Union.size()==0) {
                    Union.add(arr1[i]);
                }
                i++;
            } */
            else {
                if(Union.size()>0 && Union.get(Union.size()-1)!=arr2[j]){
                Union.add(arr2[j]);}
                else if (Union.size()==0) {
                    Union.add(arr1[i]);
                }
                j++;
            }
        }

        while (i<n){
            if(Union.get(Union.size()-1)!=arr1[i])
            {
                Union.add(arr1[i]);
            }
            i++;
        }

        while (j<m){
            if(Union.get(Union.size()-1)!=arr2[j])
            {
                Union.add(arr1[j]);
            }
            j++;
        }


        return Union;
    }
}
