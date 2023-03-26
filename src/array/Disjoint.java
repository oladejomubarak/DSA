package array;

import java.util.*;

public class Disjoint {
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,4,4,5,6,8,8};
        int[] arr2 = {3,3,2,6,7,6,5,0};
        System.out.println(Arrays.toString(disjoint(arr1, arr2)));

    }
    public static int[] disjoint(int[] arr1, int[] arr2){
        List<Integer> arr5 = new ArrayList<>();
        Set<Integer> arr6 = new HashSet<>();
        Set<Integer> arr3 = new HashSet<>();
        Set<Integer> arr4 = new HashSet<>();

        for (var a: arr1
             ) { arr3.add(a);

        }
        for (var a: arr2
             ) {arr4.add(a);

        }
        for (var val: arr3
             ) { if (!arr4.contains(val))arr5.add(val);
        }
        for (var val:arr4
             ) {if (!arr3.contains(val)) arr5.add(val);

        }

        int[] result = new int[arr5.size()];
        for (int i = 0; i < arr5.size(); i++) {
            result[i] = arr5.get(i);
        }
        return result;
    }
}
