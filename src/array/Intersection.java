package array;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1= {1,3,2,7,8,5,0, 2};
        int[] arr2 ={1,4,2,7,9,2};
       System.out.println(Arrays.toString(intersection(arr1, arr2)));
        //System.out.println(intersection(arr1, arr2));
    }
    public static int[] intersection(int[] arr1, int[] arr2){

        List<Integer> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
//        Set<Integer> arrOne = new HashSet<>();
//        Set<Integer> arrTwo = new HashSet<>();
//        for (int a:arr1) {
//            arrOne.add(a);
//        }
//        for (int a:arr2) {
//            arrTwo.add(a);
//        }
//        for (var val:arrOne) {
//            if (arrTwo.contains(val))result.add(val);
//        }
        for (var a: arr1
             ) {if (!result1.contains(a)) result1.add(a);
        }
        for (var a: arr2
             ) {if (!result2.contains(a)) result2.add(a);
        }
        for (var val : result1
             ) {if (result2.contains(val)) result.add(val);

        }

        int [] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
