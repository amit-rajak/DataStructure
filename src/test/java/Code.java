import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code {


    public static void main(String[] args) {

        String str= "testcode";
        char words[]=str.toCharArray();

        Map<Character,Long> result
                =str.chars().
                mapToObj(m->(char)m).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        result.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Filter for unique characters
                .forEach(entry -> System.out.print(entry.getKey() + " "));

    }
}
