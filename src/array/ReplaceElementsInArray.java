package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceElementsInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6};
        int[][] arr2 = {{1,3}, {4,7}, {6,1}};
        System.out.println(Arrays.toString(replace(arr1, arr2)));
        int[] nums = {1,2};
        int[][] operations = {{1,3},{2,1},{3,2}};
        System.out.println(Arrays.toString(replace(nums, operations)));

        System.out.println(Arrays.toString(arrayChange(arr1, arr2)));
    }
    public static int[] replace(int[] nums, int[][] operations){
        List<Integer> list = new ArrayList<>();
        for (var i: nums
             ) { list.add(i);
        }
        for (int i = 0; i < operations.length; i++) {
            for (int j = 0; j < operations[i].length; j++) {
                for (int k= 0; k < list.size(); k++) {
                    if( list.get(k).equals(operations[i][0])) {
                        list.remove(list.get(k));
                        list.add(k,operations[i][1]);
                        break;
                    }
                }
            }
        }
        int[] num2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num2[i] = list.get(i);
        }
    return num2;
    }

    public static int[] arrayChange(int[] nums, int[][] operations){
        int counter = 0;
        for (int i = 0; i < operations.length; i++) {
            for (int j = 0; j < operations[i].length; j++) {
                if(operations[i][j] == nums[counter]){
                    nums[counter] = operations[i][j+1];
                    counter++;
                }
            }

        }
        return nums;
    }
}
