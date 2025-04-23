package StreamP;

import java.util.*;
import java.util.stream.Collectors;

public class dataSt {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 6, 7, 9, 3, 2, 3};

        List<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
