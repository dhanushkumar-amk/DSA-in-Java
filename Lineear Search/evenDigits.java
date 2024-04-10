// leetCode problem
// to check the given number is how many even digits are available
public class evenDigits {
    public static void main(String[] args) {
int[] nums = {12, 345, 2,6,7080,10} ;
System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;

            }
        }
        return count;
    }

    // function to check whatever the number is even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // count the numbers
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= num;
        }

        return count;
    }
}
