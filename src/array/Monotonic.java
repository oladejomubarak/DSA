package array;

import java.util.Arrays;

public class Monotonic {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int[] arr1 = {6,5,4,4};
        int[] arr2 = {1,3,2};
        int[] arr3= {1,3,2,4};

        System.out.println(isMonotonic(arr));
        System.out.println(isMonotonic(arr1));
        System.out.println(isMonotonic((arr2)));
        System.out.println(isMonotonic(arr3));
    }

public static boolean isMonotonic(int[] nums){
    boolean result = true;
    if(nums[0] > nums[1]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                result = false;
                break;
            }
        }
        }
    }
    if (nums[0] < nums[1]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
                result = false;
                break;
            }
        }
        }
    }
        return result;
 }
}
