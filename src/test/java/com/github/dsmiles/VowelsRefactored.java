package com.github.dsmiles;

/**
 * I didn't like my original solution as it contained too many nested ifs.
 * So I broke it down into stage steps counting each bit separately
 */
public class VowelsRefactored {

    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        int vowelCount = 0;
        int consCount = 0;    // consonants count
        int otherCount = 0;   // other non-alphabetic character count

        String example = "ae#zyu*";

        vowelCount = countVowels(example);
        consCount = countConsonants(example);
        otherCount = countOthers(example);

        System.out.println("Number of vowels are: " + vowelCount);
        System.out.println("Number of consonants are: " + consCount);
        System.out.println("Number of other characters are: " + otherCount);
    }

    private static boolean isVowel(char ch) {
        return VOWELS.contains(String.valueOf(ch));
    }

    private static int countVowels(String sample) {
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            char ch = sample.charAt(i);
            if (isVowel(ch)) {
                count++;
                System.out.println("Vowel: " + ch);
            }
        }
        return count;
    }

    private static int countConsonants(String sample) {
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            char ch = sample.charAt(i);
            if (Character.isLetter(ch) && !isVowel(ch)) {
                count++;
                System.out.println("Consonant: " + ch);
            }
        }
        return count;
    }

    private static int countOthers(String sample) {
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            char ch = sample.charAt(i);
            if (!Character.isLetter(ch)) {
                count++;
                System.out.println("Not a vowel or consonant: " + ch);
            }
        }
        return count;
    }
}
