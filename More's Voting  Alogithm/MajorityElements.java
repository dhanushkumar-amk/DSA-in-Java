package Arrays;

public class MajorityElements {

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 3, 1, 3, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for (int i = 0; i < nums.length; i++) {

            if (votes == 0) {
                votes++;
                majority = nums[i];
            }

            else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;

    }

}

// another method

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], size = nums.length, Votes = 0;
        for (var num : nums) {
            if (num == majority)
                Votes++;
            else {
                Votes--;
                if (Votes == 0) {
                    Votes = 1;
                    majority = num;
                }
            }
        }
        return majority;
    }
}