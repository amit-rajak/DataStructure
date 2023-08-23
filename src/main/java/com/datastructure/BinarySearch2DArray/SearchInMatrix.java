package com.datastructure.BinarySearch2DArray;

//https://leetcode.com/problems/search-a-2d-matrix/submissions/
public class SearchInMatrix {
    public static void main(String[] args) {

        /*int arr[][]={{1,3,5,7},
                    {10,11,16,20},
                    {23,30,34,60}

        };*/
          int arr[][]={{1,4,7,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}

        };
         /*int arr[][]={{1,3}};*/
        int target=5;
        boolean found=searchMatrix(arr,target);
       System.out.println(found);



    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int  targetRow=findProperRow(matrix,target);

        if (targetRow==-1)
        {
            return false;
        }
        boolean isFound=SearchInPotantialRow(matrix,targetRow,target);
      return isFound;
    }

    private static int findProperRow(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int lastCol=matrix[0].length-1;

        while (low<=high)
        {
            int mid=(low+high)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][lastCol])
            {
                return mid;
            }
            else if(matrix[mid][0]>target)
            {
                high=mid-1;
            }
            else if(matrix[mid][0]<target)
            {
                low=mid+1;
            }
        }

        return -1;
    }

    public static boolean SearchInPotantialRow(int matrix[][],int targetRow,int target)
    {
        int low=0;
        int high= matrix[0].length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(matrix[targetRow][mid]==target)
            {
                return true;
            }
            else if(matrix[targetRow][mid]<target)
            {
                low=mid+1;
            }
            else if(matrix[targetRow][mid]>target)
            {
                high=mid-1;
            }
        }

       return false;

    }
}
