// package Lineear;

// find the maximum element in an 2D array 

public class findMaximumelementin2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 70, 80 },
                { 58, 69, 70, 10 },
        };

        System.out.println(maximum(arr));
    }

    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }
}
