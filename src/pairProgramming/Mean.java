package pairProgramming;

public class Mean {
    public static void main(String[] args) {

    }
    public static int mean(int[] arr){
        int total =0;
        for (int i = 0; i < arr.length; i++) {
            total+= arr[i];
        }
        return total / arr.length;
    }
}
