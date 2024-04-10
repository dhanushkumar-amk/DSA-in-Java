
// search in two dimensional array 
// question
// search the element present in  2D array or not


import java.util.Arrays;

// Search;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 70, 80 },
                { 58, 69, 70, 10 },
        };
        int target = 69;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }

        }
        return new int[]{-1,-1};
    }
}
