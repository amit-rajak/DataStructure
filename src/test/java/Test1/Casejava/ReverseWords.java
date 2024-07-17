package Test1.Casejava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String qi = "Java Concept Of The Day";
        String result = reverseWordsAndLowercase(qi);
        System.out.println(result); // Output: avaj tpecnoc fo eht yad
    }

    public static String reverseWordsAndLowercase(String input) {
        return  Arrays.stream(input.split(" "))
                .map(word->new StringBuilder(word).reverse().toString() ).collect(Collectors.joining(" "));
    }
}
