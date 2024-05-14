package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int nums[] = { -1, 2, 1, 4 };
        int target = 1;
        System.out.println(ThreeSum(nums, target));
    }

    public static int ThreeSum(int[] nums, int target) {
        Arrays.sort(nums);

        int answer = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) <= Math.abs(answer - target))
                    answer = sum;

                if (sum == target)
                    return sum;

                if (sum > target)
                    k--;
                else
                    j++;
            }
            while (i < nums.length - 3 && nums[i + 1] == nums[i]) {
                i++;
            }

        }

        return answer;

    }

}
