package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {


    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(shuffleInteger(array)));
    }

    public static int[] shuffleInteger(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int randomValue = random.nextInt(arr.length);
           int tempValue = arr[randomValue];
           arr[randomValue] = arr[i];
           arr[i] = tempValue;
        }
        return arr;
    }
}
