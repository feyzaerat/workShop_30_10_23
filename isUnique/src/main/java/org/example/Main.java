package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean hasUniqueCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "hello";

        System.out.println(hasUniqueCharacters(str1)); // true (all unique)
        System.out.println(hasUniqueCharacters(str2)); // false (not all unique)
    }
}
