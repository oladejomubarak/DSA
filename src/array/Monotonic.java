package array;

public class Monotonic {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int[] arr1 = {6,5,4,4};
        int[] arr2 = {1,3,2};



    }
public static boolean isMonotonic(int[] nums){
    boolean result = true;
    int i = 0;
    int j = i+ 1;
    if(nums[0] > nums[1]){
        for (i = 0; i < nums.length; i++){
            if(nums[i] < nums[j])  result = false;
        }
    } else {
        for (i = 0; i < nums.length; i++){
            if(nums[i] > nums[j])  result = false;
        }
    }
        return result;
}
}
