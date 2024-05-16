package Arrays;

public class oddAndEvenInArrays {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        oddAndEvenInArrays.separateEvenAndOddNumbers(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void separateEvenAndOddNumbers(int[] nums) {
        // Base Condition
        if (nums.length <= 1)
            return;

        // two pointers
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // to check the value odd or even
            while (nums[left] % 2 == 0 && left < right)
                left++;

            while (nums[right] % 2 != 0 && left < right)
                right--;
        }
        // if the above both condition is unsatisfied then swap the value
        if (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
}
