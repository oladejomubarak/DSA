package dietelChap14;

public class LongestWordInASentence {
    public static void main(String[] args) {
        String sentence = "I am a nice guy truly";
        System.out.println(findLongestWord(sentence));

    }
    public static String findLongestWord(String sentence){
        var splitWord = sentence.split("\\s+");
        String longestWord = splitWord[0];
        int maxLength = longestWord.length();
        for (String word: splitWord) { if (word.length() > maxLength) longestWord = word;}
        return longestWord;
    }
}
