package pairProgramming;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr  = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(getTwoSum(arr, target)));

    }
    public static int[] getTwoSum(int[] arr, int target){
        int[] arr1 = new int[2];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    arr1[counter] = arr[i];
                    counter++;
                    arr1[counter] = arr[j];
                }
            }
        }
        return arr1;
    }
}
