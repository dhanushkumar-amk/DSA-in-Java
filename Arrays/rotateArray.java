package Arrays;

// leetCode 189
// rotate an array

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));

    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);// o to n-1 = 6 whole array
        reverse(nums, 0, k - 1);// then 0 to k-1; 0 to k-1 = 3-1 = 2 position
        reverse(nums, k, n - 1);// k to n-1; 3 to n-1 = 6;
        return nums;

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
