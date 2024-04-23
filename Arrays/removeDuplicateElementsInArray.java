package Arrays;

public class removeDuplicateElementsInArray {

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 4, 4, 5 };
        System.out.println(removeDuplicates1(nums));
    }

    public static int removeDuplicate(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //

    public static int removeDuplicates1(int[] nums) {
        int count = 0;
        for (int current_element = 0; current_element < nums.length; current_element++) {
            // nums[current_element + 1]) is denotes next element

            if (current_element < nums.length - 1 && nums[current_element] == nums[current_element + 1]) {
                continue;
            } else {
                nums[count] = nums[current_element];
                count++;
            }

        }
        return count;
    }

}