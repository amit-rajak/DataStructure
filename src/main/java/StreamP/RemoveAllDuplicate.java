package StreamP;

import java.util.Arrays;

public class RemoveAllDuplicate {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 7, 2, 10, 5};
        int[] distinct = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(distinct));
    }
}
