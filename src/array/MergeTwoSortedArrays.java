package array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,9};
        int[] arr2  = {3,6,7,8,0};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));

    }
    public static int[] mergeArray(int[]arr1, int[]arr2){
        int length = arr1.length + arr2.length;
        int counter = 0;
        int[] arr = new int[length];
        int[] sortedArray = new int[length];
        for (int i = 0; i < arr1.length; i++) {
            arr[counter] = arr[i];
            counter++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[counter] = arr2[i];
            counter++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
