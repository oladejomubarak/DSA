package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {

    public static void main(String[] args) {
        int[] arr1 = {1,5,6,4,4,3,6,8,8};
        int[] arr2 = {3,4,2,6,7,6,5,0};
        System.out.println(getMedian(arr1));
        System.out.println(getMedian(arr2));

    }
    public static int getMedian (int[] arr){
        List<Integer> arr1 = new ArrayList<>();
        int median = 0;
        for (var a: arr
             ) {arr1.add(a);
        }
        Collections.sort(arr1);
        System.out.println(arr1);
        if (arr1.size() % 2 == 1){
            for (int i = 0; i < arr1.size(); i++) {
                int j = arr1.size() / 2;
                if (i == j) median += arr1.get(i);
            }
        }
        else {
            for (int i = 0; i < arr1.size(); i++) {
                int j = arr1.size() /2;
                int k = (arr1.size() / 2) - 1;
                float med = 0;

                if(i == j ) med+= arr1.get(i);
                if(i == k) med+= arr1.get(i);

                median+= med / 2;
            }
        }
        return median;
    }
}
