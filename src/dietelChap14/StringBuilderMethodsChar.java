package dietelChap14;

public class StringBuilderMethodsChar {
    public static void main(String[] args) {
        String value = "money";
        StringBuilder stringBuilder = new StringBuilder("principal");
        char[] chars = new char[stringBuilder.length()];
        stringBuilder.getChars(0, stringBuilder.length(), chars, 0);
        System.out.println(chars);
        StringBuilder rev = new StringBuilder(value);
        System.out.println(rev.reverse());
    }
}
