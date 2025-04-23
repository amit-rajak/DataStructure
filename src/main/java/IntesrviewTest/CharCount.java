package IntesrviewTest;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s = "sssaaabbvvccaassbbbnnnn"; // The input string
        firstOccurrenceCount(s); // Call the method to process the string
    }

    public static void firstOccurrenceCount(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>(); // Map to store character counts
        char prevChar =s.charAt(0);// Initialize the previous character
         int count=1;     // Initialize the count for the first character

        // Loop through the string starting from the second character
            for(int i=1;i<s.length();i++) {
                char currentChar=s.charAt(i);
                if(currentChar==prevChar){
                    count++;
               }
                else {
                    if(!charCountMap.containsKey(prevChar)){
                        charCountMap.put(prevChar,count);
                }
                    count=1;
                    prevChar=currentChar;
            // Get the current character
            // If the current character is the same as the previous
                 // Increment the count

                // If we encounter a new character
                // Check if we haven't already counted the previous character
                     // Store the count for the first occurrence

                 // Reset the count for the new character
                // Update the previous character to the current
            }
        }

        // After the loop, we need to add the last character's count to the map
        if (!charCountMap.containsKey(prevChar)) {
            charCountMap.put(prevChar, count);
        }

        // Print the first occurrence count of each character
        for(Map.Entry<Character,Integer> map: charCountMap.entrySet()){
            System.out.println(map.getKey() +"=" +map.getValue());
        }
    }
}
