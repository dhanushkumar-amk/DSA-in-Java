package Arrays;

import java.util.HashSet;

public class longestSequences {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2, 5 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            hs.add(n);
        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (hs.contains(num - 1))
                continue;

            int currentLength = 0;
            while (hs.contains(num)) {
                currentLength++;
                num++;
            }
            max = Math.max(max, currentLength);
        }
        return max;
    }
}
