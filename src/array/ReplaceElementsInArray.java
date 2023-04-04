package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceElementsInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6};
        int[][] arr2 = {{1,3}, {4,7}, {6,1}};
        System.out.println(Arrays.toString(replace(arr1, arr2)));
    }
    public static int[] replace(int[] nums, int[][] operations){
        List<Integer> list = new ArrayList<>();
        for (var i: nums
             ) { list.add(i);
        }
//        for (int[] i: operations
//             ) {
//            for (int j: i
//                 ) {if (list.contains(i)) {
//                     list.remove(i);
//                     list.add(j);
//                 }
//            }
//        }
        for (int i = 0; i < operations.length; i++) {
            for (int j = 0; j < operations[i].length; j++) {
                for (var k: list
                     ) {
                    if( k.equals(operations[i][0])) {
                        list.remove(k);
                        list.add(operations[i][1]);
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
}
