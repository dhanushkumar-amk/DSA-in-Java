// find minimum value

// Question
// find the minimum value in the array
// int[] num = { 20, 70, 80, 90, 10, 100 };
// expected output:
// 10

// output:
// 10

public class findMinimumNumber {
    public static void main(String[] args) {
        int[] num = { 20, 70, 80, 90, 10, 100 };
        System.out.println(min(num));
    }

    // assume array length is o
    // return the minimum value in an array

    static int min(int[] num) {
        int ans = num[0];
        for (int i = 0; i < num.length; i++) {
    // if the current value is overall less than other number return that value
            if (num[i] < ans) {
                ans = num[i];
            }
        }
        return ans;
    }

}
