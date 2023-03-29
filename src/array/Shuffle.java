package array;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(shuffle(nums, 4)));

    }
    public static int[] shuffle(int[] nums, int n){
        n = nums.length / 2;
        int[] result = new int[n*2];
        for (int i = 0; i < n; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
}
