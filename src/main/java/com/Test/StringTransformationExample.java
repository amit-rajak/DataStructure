package com.Test;

public class StringTransformationExample {
    public static void main(String[] args) {
        String original = "abcd";
        String transformed = transformString(original);

        System.out.println("Original: " + original);
        System.out.println("Transformed: " + transformed);
    }

    public static String transformString(String input) {
        // Remove the character at the center (for odd-length string)
        int middleIndex = input.length() / 2;
        input = input.substring(0, middleIndex) + input.substring(middleIndex + 1);

        // Divide the remaining string into two parts
        int halfLength = input.length() / 2;
        String part1 = input.substring(0, halfLength);
        String part2 = input.substring(halfLength);

        // Remove the center character of part1 (for odd-length string)
        middleIndex = part1.length() / 2;
        part1 = part1.substring(0, middleIndex) + part1.substring(middleIndex + 1);

        // Remove the center character of part2 (for odd-length string)
        middleIndex = part2.length() / 2;
        part2 = part2.substring(0, middleIndex) + part2.substring(middleIndex + 1);

        // Combine the resulting parts
        String output = part1 + part2;

        return output;
    }
}

