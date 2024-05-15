package Arrays;

public class jumpGame1 {
    //
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 5, 2, 1, 0, 0, 1, 3 };

        System.out.println(JumpGame(nums));

    }

    public static boolean JumpGame(int[] nums) {
        int finalPosition = nums.length - 1;

        for (int index = nums.length - 2; index >= 0; index--) {
            if (index + nums[index] >= finalPosition) {
                finalPosition = index;
            }
        }
        return finalPosition == 0;
    }
}
