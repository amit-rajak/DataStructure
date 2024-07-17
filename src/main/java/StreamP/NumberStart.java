package StreamP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberStart {

    public static void main(String[] args) {
        int arr []={10,15,8,49,25,98,32};
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(num -> String.valueOf(num).startsWith("1")).boxed()  // Convert int to Integer
                .collect(Collectors.toList());
        System.out.println(filteredList);

        String fromStr="ABC";

    }
}
