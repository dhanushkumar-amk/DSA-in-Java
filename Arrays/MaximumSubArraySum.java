
public class MaximumSubArraySum {
    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums = { 5, 6, -3, 7, -13, 8, -2, 5, -6, 7, -11, 3, 10, -10, -6, -10, 7, 2 };
        System.out.println(MaximumSubArray1(nums));

    }

    public static int MaximumSubArray(int[] nums) {

        int maxValue = nums[0];
        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > maxValue)
                maxValue = sum;
        }

        return maxValue;

    }

    public static int MaximumSubArray1(int[] nums) {

        int maxValue = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (sum >= 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }

            if (sum > maxValue) {
                maxValue = sum;
            }
        }

        return maxValue;
    }
}
