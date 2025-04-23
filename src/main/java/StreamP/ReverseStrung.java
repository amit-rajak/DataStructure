package StreamP;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStrung {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

       String result= Stream.of(str).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining());
       System.out.println(result);
    }
}
