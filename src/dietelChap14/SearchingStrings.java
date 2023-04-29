package dietelChap14;

public class SearchingStrings {
    public static void main(String[] args) {

    }
    public static int searchNumberOfCharInAString(String text, char character){
            int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == character) counter++;
        }
        return counter;
    }
}
