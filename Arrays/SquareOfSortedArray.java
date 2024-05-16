public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(sortedSquare(nums));
    }

    public static int[] sortedSquare(int[] nums) {

        int[] result = new int[nums.length];

        // square all the elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int firstPoint = 0;
        int lastPoint = nums.length - 1;

        for (int value = nums.length; value >= 0; value--) {
            if (nums[firstPoint] > nums[lastPoint]) {
                result[value] = nums[firstPoint];
                firstPoint++;
            } else {
                result[value] = nums[lastPoint];
                lastPoint--;
            }
        }
        return result;
    }
}
