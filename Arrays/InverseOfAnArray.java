public class InverseOfAnArray {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 0, 4 };
        System.out.println("Before inverse");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        int[] b = Inverse(nums);
        System.out.println();
        System.out.println("After Inverse");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");

        }
    }

    public static int[] Inverse(int[] nums) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];
            b[value] = i;

        }
        return b;

    }
}
