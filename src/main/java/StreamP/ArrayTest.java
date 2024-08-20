package StreamP;


import java.util.HashMap;
import java.util.Map;

public class ArrayTest {

    //Case 1 - input - {1, 2, 3, 3, 2} output - 1
    //Case 2 - input - {1, 2, 3, 2, 1, 4} output - 0
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3, 2}; //1
        int arr2[] = {1, 2, 3, 2, 1, 4};//0
        int arr3[]={2,3,3,4,4,5,5};
       // uniqueCheck(arr2);
        System.out.println("Unique count for arr1: " + uniqueCheck(arr1)); // Output: 1
       System.out.println("Unique count for arr2: " + uniqueCheck(arr2)); // Output: 0
         System.out.println("Unique count for arr2: " + uniqueCheck(arr3)); // Output: 1
    }

    public static int uniqueCheck(int arr[]) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num:arr){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        int count =-0;
       for(Map.Entry<Integer,Integer> map:countMap.entrySet()){
         if(map.getValue()==1){
             count++;
         }
         if(count>1){
             return 0;
         }
       }
        return count;
    }
}
