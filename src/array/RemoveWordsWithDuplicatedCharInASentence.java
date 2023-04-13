package array;

import java.util.List;

public class RemoveWordsWithDuplicatedCharInASentence {
    public static void main(String[] args) {
        String sentence = "a good boy with good vibes";
        List<String> stringOfWord = List.of(sentence.split(" "));
        System.out.println(stringOfWord);

        System.out.println(removeDuplicate(sentence));

    }
    public static String removeDuplicate(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        List<String> split = List.of(sentence.split(" "));

        for (String word : split) {
            for (int j = 0; j < word.length(); j++) {
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(j) == word.charAt(i))) stringBuilder.append(word);
            }
            }
        }
        return stringBuilder.toString();
    }
}
