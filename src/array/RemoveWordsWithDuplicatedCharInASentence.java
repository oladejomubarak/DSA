package array;

import java.util.List;

public class RemoveWordsWithDuplicatedCharInASentence {
    public static void main(String[] args) {
        String sentence = "a good boy with good vibes";
        List<String> stringOfWord = List.of(sentence.split(" "));
        System.out.println(stringOfWord);

    }
    public static String removeDuplicate(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        List<String> split = List.of(sentence.split(" "));

        for (int i = 0; i < split.size(); i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        return null;
    }
}
