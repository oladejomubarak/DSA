package pairProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mode {
    public static void main(String[] args) {
        int [] arr = {1,3,6,6,6,6,6,7,3,0,7,8};
        System.out.println(mode(arr));

    }
    public static int mode (int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr
             ) { if (!map.containsKey(num)){
            map.put(num, 1);
        } else {
            int value = map.get(num);
            map.put(num, value + 1);

        }
        }
        int mode = map.get(0);
        for (int num: map.keySet()
        ) { if(map.get(num) > mode) mode = num;
        }
        return mode;
    }
}
