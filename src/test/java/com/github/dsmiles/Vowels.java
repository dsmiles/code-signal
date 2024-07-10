package com.github.dsmiles;

class Vowels {

    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        int vowelCount = 0;
        int consCount = 0;    // consonants count
        int otherCount = 0;   // other non-alphabetic character count

        String example = "ae#zyu*";

        // remember what the vowels are!!
        String vowels = "aeiou";

        // iterate through String
        // check if character is alphabetic
        // check if character is a vowelCount
        // everything else is non-alphabetic character
        for (int i = 0; i < example.length(); i++) {
            char ch = example.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.contains(String.valueOf(ch))) {
                    vowelCount++;
                } else {
                    consCount++;
                }
            } else {
                otherCount++;
            }
        }

        System.out.println("Number of vowels are: " + vowelCount);
        System.out.println("Number of consonants are: " + consCount);
        System.out.println("Number of other characters are: " + otherCount);
    }
}
