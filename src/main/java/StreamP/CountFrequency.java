package StreamP;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> map=inputString.chars()
                .filter(c->c!=' ')// if you want igonre space
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }
}
