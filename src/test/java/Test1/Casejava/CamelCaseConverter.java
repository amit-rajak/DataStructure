package Test1.Casejava;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String input = "hello world amit";
        String camelCase = toCamelCase(input);
        System.out.println(camelCase); // Output: HelloWorld
    }

    public static String toCamelCase(String input) {

        StringBuilder camelCase = new StringBuilder();
        Boolean capitalizeNext = false;
        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                camelCase.append(c); // appned space
            } else {
                if (capitalizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    camelCase.append(Character.toLowerCase(c));
                }
            }
        }
            return camelCase.toString();
    }

    public static String toCamelCaseALl(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false; // start as false to keep the first word in its original case

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                camelCase.append(c); // Append space
            } else {
                if (capitalizeNext) {
                        camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    camelCase.append(Character.toLowerCase(c));
                }
            }
        }

        return camelCase.toString();
    }

}