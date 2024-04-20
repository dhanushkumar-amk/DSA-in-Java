package Arrays;
// package Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 78 };
        System.out.println(maxValue(arr));
    }

    static int maxValue(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
