package pairProgramming;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr  = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(getTwoSum(arr, target)));
    }
    public static int[] getTwoSum(int[] nums, int target){
        int[] arr1 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    arr1[0] = i;
                    arr1[1] = j;
                }
            }
        }
        return arr1;
    }
}
