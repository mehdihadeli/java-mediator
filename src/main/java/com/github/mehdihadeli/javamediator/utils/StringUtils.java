package com.github.mehdihadeli.javamediator.utils;

public final class StringUtils {
    private StringUtils() {}

    public static String toSnakeCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        result.append(Character.toLowerCase(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                result.append('_'); // Add an underscore before the uppercase letter
                result.append(Character.toLowerCase(currentChar)); // Convert to lowercase
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
