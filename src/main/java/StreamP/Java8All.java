package StreamP;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Java8All {
    public static void main(String[] args) {

        separationOfEvenOddNumberInMap();
        partitionDuplicatesAndNonDuplicates();

    }



    private static void separationOfEvenOddNumberInMap() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, String> partitionedMap = oneToTen.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0,
                        Collectors.mapping(Object::toString, Collectors.joining(", "))));

        System.out.println("even "+partitionedMap.get(true));
        System.out.println("even "+partitionedMap.get(false));
    }
    private static void partitionDuplicatesAndNonDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 6, 9, 10, 9);

        Map<Boolean, List<Integer>> partitionedMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))  // Group by the number and count occurrences
               //till found Occurence

                .entrySet().stream()
                .collect(Collectors.partitioningBy(e -> e.getValue() == 1,Collectors.mapping(
                        Map.Entry::getKey,Collectors.toList())
                ));


        System.out.println("Non-duplicates: " + partitionedMap.get(true));
        System.out.println("Duplicates: " + partitionedMap.get(false));
    }

}