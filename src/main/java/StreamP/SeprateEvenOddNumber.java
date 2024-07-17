package StreamP;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeprateEvenOddNumber {
    public static void main(String[] args) {

        int arr[]= {1,3,4,10,2,18,9,7,17,19,20,23};

        // Creating a stream from the array
        Stream<Integer> stream1 = Arrays.stream(arr).boxed();

        // Partitioning the stream into even and odd numbers
        Map<Boolean, String> partitionedMap = stream1.collect(Collectors.partitioningBy(n -> n % 2 == 0,
                Collectors.mapping(Object::toString, Collectors.joining(", "))));

        // Printing the partitioned numbers
        System.out.println("Even numbers: " + partitionedMap.get(true));
        System.out.println("Odd numbers: " + partitionedMap.get(false));

    }
}
