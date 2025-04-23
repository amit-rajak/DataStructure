package StreamP;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoRepetaing {


    public static void main(String[] args) {

        String str = "aabccdbeefgg";

        System.out.println(findNonReptChar(str));
    }


    public static char findNonReptChar(String str) {

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }
}












