public class TestS {
    public static void main(String[] args) {
        String str = "jjavaskill";
        /*char result = findFirstNonRepeatingChar(str);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }*/

        Integer i1 =0;
        int i2 = 5;
        Integer i3 = 5;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i3);
        System.out.println(i1.equals(i3));
    }

    public static char findFirstNonRepeatingChar(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;

            // Check if the current character is repeated
            for (int j = 1; j < length; j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            // If the character is not repeated, return it
            if (!isRepeated) {
                return currentChar;
            }
        }

        // If no non-repeating character is found, return 0 (null character)
        return 0;
    }
}
