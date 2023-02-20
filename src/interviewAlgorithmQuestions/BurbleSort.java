package interviewAlgorithmQuestions;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class BurbleSort {
    public static int[] sortArray(int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++){
            for (int j = i + 1; j < unsortedArray.length ; j++) {
                if(unsortedArray[i] < unsortedArray[j]){
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }

            }
        }
        return  unsortedArray;
    }

    public static void main(String[] args) {
        int [] array = {3, 6, 10,2, 1, 0, 6, 7, 4};
        System.out.printf("Sorted array is: %s", Arrays.toString(sortArray(array)));
    }
}
