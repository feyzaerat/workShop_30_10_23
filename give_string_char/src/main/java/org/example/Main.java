package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "Tobeto";
        countAndPrintCharacterCounts(input);
    }

    public static void countAndPrintCharacterCounts(String input) {
        // Karakter sayımlarını depolamak için bir HashMap oluştur
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Giriş dizesini küçük harfe dönüştür
        input = input.toLowerCase();

        // Dizedeki karakterler arasında yineleme
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Only count letters, not other characters
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Karakter sayılarını yazdır
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ":" + charCountMap.get(c));
        }
    }
}
