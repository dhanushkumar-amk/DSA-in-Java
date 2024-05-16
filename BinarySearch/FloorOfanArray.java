package BinarySearch;

public class FloorOfanArray {
    public static void main(String[] args) {
        int arr[] = { -17, -1, 0, 1, 2, 3, 4, 6, 7, 17, 56, 88, 99 };
        int target = 100;
        int ans = floor(arr, target);
        System.out.println(ans);

    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        if (end > arr.length) {

            return arr[end];
        } else {
            return -1;
        }
    }
}
