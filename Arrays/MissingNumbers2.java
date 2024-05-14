package Arrays;

public class MissingNumbers2 {
    public static void main(String[] args) {
        long[] arr = { 3, 0, 1, 5, 2, 4, 8, 7, 9 };
        System.out.println(MissingNumber(arr));
    }

    public static long MissingNumber(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        long actualSum = (arr.length * (arr.length + 1)) / 2;
        long missingNumber = actualSum - sum;

        return missingNumber;
    }

}
