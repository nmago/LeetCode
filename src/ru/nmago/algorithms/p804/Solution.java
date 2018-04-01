package ru.nmago.algorithms.p804;

import java.util.HashSet;

/** #804
 * Given a list of words, each word can be written as a concatenation of the Morse
 * code of each letter. For example, "cab" can be written as "-.-.-....-",
 * (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation,
 * the transformation of a word.
 * Return the number of different transformations among all words we have.
 *
 * Source: https://leetcode.com/problems/unique-morse-code-words/description/
 *
 *
 */

public class Solution {
    private final static String[] morseAlp = new String[]{".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words){
        if(words == null) return 0;
        HashSet<String> uniqueWords = new HashSet<>();
        for(String word : words){
            StringBuilder morseForm = new StringBuilder();
            for(char c : word.toCharArray()){
                morseForm.append(morseAlp[c - 'a']);
            }
            uniqueWords.add(morseForm.toString());
        }
        return uniqueWords.size();
    }
}
