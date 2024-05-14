package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 0, 7 };
        // output: [7, 0, 8, 6, 4, 1]

        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ReverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap a value
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
