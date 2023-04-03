package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringsInArray {
    public static void main(String[] args) {
        String[] array = {"oladejo", "adelakun"};
        var arrayList = Arrays.asList(array);
        System.out.println(reverseArray(arrayList));
    }
    private static List<String> reverseArray(List<String> arr){
            List<String> reverse = new ArrayList<>();
        int increment = 0;
        for (String string : arr) {
            String arr1 = "";
            //char[] charArray = string.toCharArray();
            for (int i = string.length() -1; i >=0; i--) {
                arr1+=string.charAt(i);
                increment++;
            }
            reverse.add(arr1);

        }
        return reverse;
    }
}
