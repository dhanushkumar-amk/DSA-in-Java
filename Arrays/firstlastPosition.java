package Arrays;

import java.util.Arrays;

public class firstlastPosition {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int startValue = search(nums, target, true);
        int endValue = search(nums, target, false);
        ans[0] = startValue;
        ans[1] = endValue;
        return ans;
    }

    // this function can return the index value of our target

    public static int search(int[] nums, int target, boolean FindStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle elements
            // int mid = (start + end)/2;

            // might be possible exists th range of the value
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                // if ans found
                ans = mid;
                if (FindStartIndex == true) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
