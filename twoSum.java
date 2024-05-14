import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11 };
        System.out.println(Arrays.toString(sum(nums, 18)));
    }

    public static int[] sum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int RequireNumber = target - nums[i];

            if (hm.containsKey(RequireNumber)) {
                int arr[] = { hm.get(RequireNumber), i };
                return arr;
            } else {
                // nums[i] => hashmap number and  i => is a index Number
                hm.put(nums[i], i);
            }
        }
        return null;
    }
}
