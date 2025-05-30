package interview_related;

import java.util.*;

public class DuplicateCharInEachWord {

    public static List<Character> findDuplicateCharsInWords(String sentence) {
        List<Character> duplicates = new ArrayList<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            Set<Character> seen = new HashSet<>();
            Set<Character> duplicateSet = new HashSet<>();

            for (char c : word.toCharArray()) {
                if (seen.contains(c)) {
                    duplicateSet.add(c);
                } else {
                    seen.add(c);
                }
            }

            duplicates.addAll(duplicateSet);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        String input = "Ramesh you are good boy";
        System.out.println("Duplicate characters: " + findDuplicateCharsInWords(input));
    }
}
