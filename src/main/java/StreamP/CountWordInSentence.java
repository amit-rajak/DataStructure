package StreamP;

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;
import java.util.List;

public class CountWordInSentence {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String str= "java";

    Long noOf=    strings.stream().flatMap(s->Arrays.stream(s.split(" ")))
                .filter(w->w.equals(str)).count();

        System.out.println(noOf);
    }
}
