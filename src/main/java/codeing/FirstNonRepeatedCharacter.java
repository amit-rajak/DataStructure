package codeing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "ava articles are Awesome";
        char result = findFirstNonRepeatedCharacter(input);
        System.out.println("First non-repeated character: " + result);
    }

    public static char findFirstNonRepeatedCharacter(String input) {
        Map<Character, Long> charCountMap = input
                .chars()
                .mapToObj(c -> (char) c)
                .collect(
                        LinkedHashMap::new,
                        (map, ch) -> map.merge(ch, 1L, Long::sum),
                        LinkedHashMap::putAll
                );

        Optional<Character> firstNonRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        return firstNonRepeatedChar.orElse('\0'); // '\0' represents no non-repeated character found
    }
}

