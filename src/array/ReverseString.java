package array;

public class ReverseString {
    public static void main(String[] args) {
        String string= "lambda";
        //reverse(string);
        System.out.print(reverseString(string));
    }
    public static void reverse(String word){

        for (int i = word.length() -1; i>=0  ; i--) {
            System.out.print(word.charAt(i));
        }
    }
    public static String reverseString(String word){
        String reversedString = "";
        for (int i = word.length() -1; i >= 0; i--) {
            char chatAtEachReversedIndex = word.charAt(i);
            reversedString+=chatAtEachReversedIndex;
        }
        return reversedString;
    }
}
