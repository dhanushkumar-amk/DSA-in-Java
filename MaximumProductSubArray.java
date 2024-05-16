public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, -3, 0, -4, -5, 7 };
        int answer = maxProduct(nums);
        System.out.println(answer);
    }

    public static int maxProduct(int arr[]) {
        int n = arr.length;
        int leftPosition = 1;
        int rightPosition = 1;
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {

            leftPosition = leftPosition == 0 ? 1 : leftPosition;
            rightPosition = rightPosition == 0 ? 1 : rightPosition;

            leftPosition *= arr[i];
            rightPosition *= arr[n - 1 - i];

            ans = Math.max(ans, Math.max(leftPosition, rightPosition));

        }
        return ans;
    }

}
