package Arrays;

/**
 * MoveZeroToEnd
 */
public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] nums = { 1, 4, 0, 4, 0, 5, 0, 3 };

        System.out.println(moveZeroes(nums));
    }

    public static void moveZeroes(int[] nums) {

        int size = nums.length;
        if (size == 0 || size == 1)
            return;
        int nonZero = 0;
        int zero = 0;
        while (nonZero < 0) {
            if (nums[nonZero] != 0) {
                int temp = nums[nonZero];
                nums[nonZero] = nums[zero];
                nums[zero] = temp;
                zero++;
                nonZero++;
            } else {
                nonZero++;
            }
        }
    }
}