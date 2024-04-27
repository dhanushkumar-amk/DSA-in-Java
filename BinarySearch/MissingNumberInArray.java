package BinarySearch;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            // int nums[] = { 3, 0, 1 };
            // 0 = 0 + 3 = 3 + 0 =3; + 3+1 = 4;

        }
        int actualSum = nums.length * (nums.length + 1) / 2;
        int missingNum = actualSum - sum;
        // 3 * 4 /2; 6
        // missingNum = 6 - 4; = 2;
        return missingNum;

    }
}