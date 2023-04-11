package array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);

    }
    public static void rotate(int[] nums, int k){
        int rotate = 0;
        int move = nums.length -1;

        for (int i = 0; i <  nums.length-1; i++) {
            int j = i + 1;
            while (rotate < k) {
                if (move == nums.length - 1) {
                    nums[move] = nums[i];
                    nums[i] = nums[j];
                    nums[j] = nums[move];
                }
                rotate++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}
