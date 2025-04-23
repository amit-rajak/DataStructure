package StreamP;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurence {
    public static void main(String[] args) {
        String someString = "JAVA PROGRAMMER";

        Map<Character, Long> map=   someString.chars()
                //.filter(c->c!=' ')// if you want igonre space
                .mapToObj(m->(char)m)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
