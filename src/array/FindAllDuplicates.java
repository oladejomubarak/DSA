package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, value + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (var i : map.keySet()
             ) { if (map.get(i) > 1) duplicates.add(i);
        }
        return duplicates;
    }
}
