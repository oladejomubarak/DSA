package array;

import java.util.Random;

public class ShuffleArray {
    private static final Random random = new Random();

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
