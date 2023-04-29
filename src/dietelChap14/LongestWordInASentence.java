package dietelChap14;

import java.util.Arrays;

public class LongestWordInASentence {
    public static void main(String[] args) {
        String sentence = "I am a truly guy nice ";
        System.out.println(findLongestWord(sentence));

    }
    public static String findLongestWord(String sentence){
        var splitWord = sentence.split("\\s+");
        String longestWord = "";
        for (String word: splitWord) { if (word.length() > longestWord.length()) longestWord = word;}
        return longestWord;
    }
}
