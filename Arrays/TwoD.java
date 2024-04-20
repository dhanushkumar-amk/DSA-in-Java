package Arrays;

import java.util.Arrays;

/**
 * TwoD
 */

/*
 * 1 2 3
 * 4 6 8
 * 5 4 7
 */
public class TwoD {

    public static void main(String[] args) {
        // declaration of arrays
        // int[][] arr = new int[3][];

        // adding rows is mandatory
        // adding column is not mandatory

        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // };
        // an array of arrays

        // Dynamic array

        int[] arr = { 1, 2, 3, 4, 6, 78 };
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
