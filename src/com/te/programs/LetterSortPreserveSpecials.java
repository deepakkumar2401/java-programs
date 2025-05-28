package com.te.programs;

public class LetterSortPreserveSpecials {
    public static void main(String[] args) {
        String input = "KLJjklAaZizI#$%^NAMmn&opOPBBbbb";
        String output = sortLettersPreservingSpecials(input);
        System.out.println(output);
    }

    public static String sortLettersPreservingSpecials(String input) {
        // Extract only letters
        StringBuilder lettersOnly = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                lettersOnly.append(c);
            }
        }

        // Sort letters case-sensitive
        char[] letters = lettersOnly.toString().toCharArray();
        java.util.Arrays.sort(letters);

        // Reconstruct the result with sorted letters
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters[letterIndex++]);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}

