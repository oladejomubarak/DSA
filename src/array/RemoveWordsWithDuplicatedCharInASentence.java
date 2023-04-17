package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveWordsWithDuplicatedCharInASentence {
    public static void main(String[] args) {
        String sentence = "a good boy with good vibes";
        List<String> stringOfWord = List.of(sentence.split(" "));
        System.out.println(stringOfWord);

        System.out.println(removeDuplicate(sentence));

        System.out.println(removeDuplicates(sentence));

    }
    public static String removeDuplicate(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        List<String> split = new java.util.ArrayList<>(List.of(sentence.split(" ")));

        for (String word : split) {
            for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if (word.charAt(i)== word.charAt(j)) split.remove(word);

            }

            }
            break;
        }
        for (String word : split) {
            stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString();
    }
    public static String removeDuplicates(String sentence){
        String[] words = sentence.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words
                List<String> lst = new ArrayList<>(Arrays.asList(word.spit))
             ) { if (word.length() == new HashSet<>(Arrays.asList(word.split(""))).size()){
                 stringBuilder.append(word).append(" ");
        }

        }

        return stringBuilder.toString();
    }
}
