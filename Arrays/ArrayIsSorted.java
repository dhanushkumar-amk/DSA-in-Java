package Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(SortedArray(arr));
    }

    public static boolean SortedArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else
                return false;
        }
        return true;
    }
}
